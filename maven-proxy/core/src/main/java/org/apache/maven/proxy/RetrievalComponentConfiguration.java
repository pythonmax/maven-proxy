package org.apache.maven.proxy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author  Ben Walding
 * @version $Id$
 */
public class RetrievalComponentConfiguration
{
    private final Map proxies = new HashMap();
    private final List repos = new ArrayList();

    public void addProxy(ProxyConfiguration pc)
    {
        proxies.put(pc.getKey(), pc);
    }

    public void removeProxy(String key)
    {
        proxies.remove(key);
    }

    public ProxyConfiguration getProxy(String key)
    {
        return (ProxyConfiguration) proxies.get(key);
    }

    /**
     * There is no specific order to proxy configuration.
     * @return
     */
    public Set getProxies()
    {
        return Collections.unmodifiableSet(proxies.entrySet());
    }

    public void addRepo(RepoConfiguration repo)
    {
        repos.add(repo);
    }
    
    public List getRepos() {
        return Collections.unmodifiableList(repos);
    }

}
