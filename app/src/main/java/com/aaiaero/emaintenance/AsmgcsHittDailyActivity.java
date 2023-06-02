package com.aaiaero.emaintenance;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.graphics.Bitmap;
        import android.graphics.BitmapFactory;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;

        import java.io.ByteArrayOutputStream;

public class AsmgcsHittDailyActivity extends AppCompatActivity {

    Button smr, cps,cms;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmgcs_hitt_daily);

        setTitle("Daily HITT ASMGCS Maintenance");

        smr = (Button) findViewById(R.id.smr);
        cps = (Button) findViewById(R.id.cps);
        cms = (Button) findViewById(R.id.cms);


        Intent intent = getIntent();

    }

    public void smrClicked (View view){

        Intent intent = new Intent(getApplicationContext(),AsmgcsHittSmrSiteDailyActivity.class);
        startActivity(intent);

    }

    public void cpsClicked (View view){
        Intent intent = new Intent(getApplicationContext(),AsmgcsHittCpsSiteDailyActivity.class);
        startActivity(intent);

    }

    public void cmsClicked (View view){
        Intent intent = new Intent(getApplicationContext(),AsmgcsHittCmsSiteDailyActivity.class);
        startActivity(intent);

    }
}
