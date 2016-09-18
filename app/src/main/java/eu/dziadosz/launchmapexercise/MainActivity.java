package eu.dziadosz.launchmapexercise;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showButtonClicked(View view){
        // get lat and lng values
        EditText latitudeEditText = (EditText) findViewById(R.id.latitude);
        EditText longitudeEditText = (EditText) findViewById(R.id.longitude);
        String numberOne = latitudeEditText.getText().toString();
        String numberTwo = longitudeEditText.getText().toString();
        double lat = Double.parseDouble(numberOne);
        double lng = Double.parseDouble(numberTwo);
        // show map
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:"+lat+","+lng));
        startActivity(intent);
    }
}
