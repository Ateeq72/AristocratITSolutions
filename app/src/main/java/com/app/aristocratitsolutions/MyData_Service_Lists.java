package com.app.aristocratitsolutions;

import android.content.Context;

/**
 * Created by aristocrat on 11/1/16.
 */
public class MyData_Service_Lists {

    protected String service_name;
    protected String service_desc;
    protected String service_image;


    public int getImageResourceId(Context context)
    {
        try {
            return context.getResources().getIdentifier(this.service_image, "drawable", context.getPackageName());

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
