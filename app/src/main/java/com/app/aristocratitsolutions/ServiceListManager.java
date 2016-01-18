package com.app.aristocratitsolutions;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aristocrat on 12/1/16.
 */
public class ServiceListManager {

    private static String[] servicesArray = {"Software Solutions", "PhD Research Support",
            "Graphics Design", "Interior and Architect Design", "Events Management",
            "Business Writing", "Corporate Services"};

    private static ServiceListManager mInstance;
    private List<MyData> Services;

    public static ServiceListManager getInstance() {
        if (mInstance == null) {
            mInstance = new ServiceListManager();
        }

        return mInstance;
    }

    public List<MyData> getServices()
    {
        if(Services == null)
        {
            Services = new ArrayList<MyData>();
            for (String service_names : servicesArray)
            {
                MyData md = new MyData();
                md.service_name = service_names;
                md.service_image = service_names.replaceAll("\\s+","").toLowerCase();
                Services.add(md);
            }
        }
        return Services;
    }

}
