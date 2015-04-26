package tw.andyang.svg;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    private ImageView svgImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        svgImageView = (ImageView)findViewById(R.id.svgImageView);
        Drawable drawable = svgImageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
            Log.d("Animatable", "true");
        }else{
            Log.d("Animatable", "false");
        }
    }

}
