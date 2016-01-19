package com.app.aristocratitsolutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aristocrat on 12/1/16.
 */
public class SoftwareServListManager {

    private static String[] servicesTitle = {"Software Development",
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

    private static String[] servicesDesc = {"Awesome Service! \n and this is a place holder!",
            "Awesome Service! \n and this is a place holder!",
            "Awesome Service! \n and this is a place holder!",
            "Awesome Service! \n and this is a place holder!",
            "Awesome Service! \n and this is a place holder!",
            "Awesome Service! \n and this is a place holder!",
            "Awesome Service! \n and this is a place holder!",
            "Awesome Service! \n and this is a place holder!",
            "Awesome Service! \n and this is a place holder!",
            "Awesome Service! \n and this is a place holder!",
            "Awesome Service! \n and this is a place holder!",
            "Awesome Service! \n and this is a place holder!",
            "Awesome Service! \n and this is a place holder!",
            "Awesome Service! \n and this is a place holder!",
            "Awesome Service! \n and this is a place holder!"};


    private static SoftwareServListManager mInstance;
    private List<MyData_Service_Lists> Services;

    public static SoftwareServListManager getInstance() {
        if (mInstance == null) {
            mInstance = new SoftwareServListManager();
        }

        return mInstance;
    }

    public List<MyData_Service_Lists> getServices()
    {
        if(Services == null)
        {
            Services = new ArrayList<MyData_Service_Lists>();

            for(int i= 0 ; i <15 ; i++)
            {
                MyData_Service_Lists md = new MyData_Service_Lists();
                md.service_name = servicesTitle[i];
                md.service_desc = servicesDesc[i];
                md.service_image = "common";

                Services.add(md);
            }

        }
        return Services;
    }

}
