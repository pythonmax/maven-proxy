package org.apache.maven.proxy.engine;

/*
 * Copyright 2003-2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.maven.proxy.request.BaseProxyResponse;

/**
 * @author Ben Walding
 */
public class MockProxyResponse extends BaseProxyResponse
{
    private long lastModified;
    private int statusCode;
    private int contentLength;
    private String contentType;
    private ByteArrayOutputStream outputStream;

    public int getContentLength()
    {
        return contentLength;
    }

    public void setContentLength( int contentLength )
    {
        this.contentLength = contentLength;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public void setStatusCode( int statusCode )
    {
        this.statusCode = statusCode;
    }

    public long getLastModified()
    {
        return lastModified;
    }

    public void setLastModified( long lastModified )
    {
        this.lastModified = lastModified;
    }

    public void sendError( int statusCode )
    {
        setStatusCode( statusCode );
    }

    public OutputStream getOutputStream()
    {
        outputStream = new ByteArrayOutputStream();
        return outputStream;
    }

    /**
     * If no content body (eg. head only request), returns null.
     * If empty content body, returns empty string.
     * @return
     */
    public String getContent()
    {
        if ( outputStream == null )
        {
            return null;
        }

        return outputStream.toString();
    }

    public void sendOK()
    {
        setStatusCode( HttpServletResponse.SC_OK );
    }

    public void setContentType( String contentType )
    {
        this.contentType = contentType;
    }

    public String getContentType()
    {
        return contentType;
    }

}