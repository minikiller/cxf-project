package com.sunlf.tp.restfule.internal;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Properties;

import com.sunlf.tp.restfule.MyService;
import com.sunlf.tp.restfule.impl.MyServiceImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


import com.sunlf.tp.restfule.ExampleService;
import org.osgi.framework.ServiceReference;

/**
 * Extension of the default OSGi bundle activator
 */
public final class ExampleActivator
    implements BundleActivator
{
    private ServiceReference m_webContainerRef;
    /**
     * Called whenever the OSGi framework starts our bundle
     */
    public void start( BundleContext bc )
        throws Exception
    {
        System.out.println( "STARTING com.sunlf.tp.restfule" );

        Dictionary props = new Properties();
        // add specific service properties here...

        System.out.println( "REGISTER com.sunlf.tp.restfule.ExampleService" );

        // Register our example service implementation in the OSGi service registry
        bc.registerService( ExampleService.class.getName(), new ExampleServiceImpl(), props );

        //this.m_webContainerRef = bc.getServiceReference(WebContainer.class.getName());
        /*Dictionary<String, String> restProps = new Hashtable<String, String>();

        restProps.put("service.exported.interfaces", "*");
        restProps.put("service.exported.configs", "org.apache.cxf.rs");
        restProps.put("service.exported.intents", "HTTP");
       // restProps.put("org.apache.cxf.rs.provider", MyService.class.getName());
         restProps.put("org.apache.cxf.rs.address", "http://localhost:8080");
//        restProps.put("org.apache.cxf.ws.httpservice.context", "/test");
        bc.registerService(MyService.class.getName(), new MyServiceImpl(), restProps);*/


    }

    /**
     * Called whenever the OSGi framework stops our bundle
     */
    public void stop( BundleContext bc )
        throws Exception
    {
        System.out.println( "STOPPING com.sunlf.tp.restfule" );

        // no need to unregister our service - the OSGi framework handles it for us
    }
}

