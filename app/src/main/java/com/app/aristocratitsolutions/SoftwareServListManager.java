package com.app.aristocratitsolutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aristocrat on 12/1/16.
 */
public class SoftwareServListManager {

    private static String[] servicesArray = {"Software Development",
            "Customize Software Development",
            "ERP Solutions",
            "CRM Software",
            "Web Based Applications",
            "Cloud Based software development",
            "E-commerce application development",
            "Mobile Application Development",
            "iOS Application Development",
            "Android Application Development",
            "Windows Application Development",
            "Digital Marketing",
            "Search Engine Optimization (SEO)",
            "Pay Per Click (PPC)",
            "Social Media"};

    private static SoftwareServListManager mInstance;
    private List<MyData> Services;

    public static SoftwareServListManager getInstance() {
        if (mInstance == null) {
            mInstance = new SoftwareServListManager();
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
                md.service_image = "common";

                Services.add(md);
            }
        }
        return Services;
    }

}
