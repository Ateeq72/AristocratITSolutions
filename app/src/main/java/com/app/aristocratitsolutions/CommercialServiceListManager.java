package com.app.aristocratitsolutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aristocrat on 12/1/16.
 */
public class CommercialServiceListManager {

    private static String[] servicesArray = {"Software Solutions", "PhD Research Support",
            "Graphics Design", "Interior and Architect Design", "Events Management",
            "Business Writing", "Corporate Services"};

    private static CommercialServiceListManager mInstance;
    private List<MyData_Common> Services;

    public static CommercialServiceListManager getInstance() {
        if (mInstance == null) {
            mInstance = new CommercialServiceListManager();
        }

        return mInstance;
    }

    public List<MyData_Common> getServices()
    {
        if(Services == null)
        {
            Services = new ArrayList<MyData_Common>();
            for (String service_names : servicesArray)
            {
                MyData_Common md = new MyData_Common();
                md.service_name = service_names;
                md.service_image = service_names.replaceAll("\\s+","").toLowerCase();
                Services.add(md);
            }
        }
        return Services;
    }

}
