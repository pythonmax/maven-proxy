package org.apache.maven.proxy.standalone.http;

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

import org.apache.avalon.framework.activity.Startable;
import org.apache.avalon.framework.configuration.Configurable;

/**
 * Configuration: Accepts "port" as an integer specifying the port to listen on
 * @author  Ben Walding
 * @version $Id$
 */
public interface HttpServer extends Startable, Configurable
{
	String ROLE = HttpServer.class.getName();
}
