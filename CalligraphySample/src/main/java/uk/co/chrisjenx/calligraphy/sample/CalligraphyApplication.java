package uk.co.chrisjenx.calligraphy.sample;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by chris on 06/05/2014.
 * For Calligraphy.
 */
public class CalligraphyApplication extends Application {

    private static boolean USE_ENUM = true;

    @Override
    public void onCreate() {
        super.onCreate();

        if (USE_ENUM) {
            CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                            .setDefaultFontPath("fonts/Roboto-ThinItalic.ttf")
                            .fontMapping("RobotoThinItalic", 0, "fonts/Roboto-ThinItalic.ttf")
                            .fontMapping("RobotoBold", 1, "fonts/Roboto-Bold.ttf")
                            .fontMapping("RobotoCondensedRegular", 2, "fonts/RobotoCondensed-Regular.ttf")
                            .fontMapping("OswaldStencbab", 3, "fonts/Oswald-Stencbab.ttf")
                            .fontMapping("gwt", 4, "fonts/gtw.ttf")
                            .setFontAttrId(R.attr.font)
                            .addCustomStyle(TextField.class, R.attr.textFieldStyle)
                            .build()
            );
        } else {
            CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                    .setDefaultFontPath("fonts/Roboto-ThinItalic.ttf")
                    .setFontAttrId(R.attr.fontPath)
                    .addCustomStyle(TextField.class, R.attr.textFieldStyle)
                    .build());
        }

    }
}
