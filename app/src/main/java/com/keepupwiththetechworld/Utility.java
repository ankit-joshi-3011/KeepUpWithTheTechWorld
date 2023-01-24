package com.keepupwiththetechworld;

import android.content.Context;

public class Utility {
    public static String[] getResourceStringsFromIds(Context context, int... resourceIds) {
        String[] resourceStrings = new String[resourceIds.length];

        for (int index = 0; index < resourceIds.length; index++) {
            resourceStrings[index] = context.getString(resourceIds[index]);
        }

        return resourceStrings;
    }
}
