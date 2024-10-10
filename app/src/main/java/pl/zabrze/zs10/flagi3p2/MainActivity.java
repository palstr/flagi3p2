package pl.zabrze.zs10.flagi3p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int licznik = 0;
    private TextView textViewPolecenie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zlaOpdowiedz(View view) {
        Toast.makeText(this, "Ten kolor jest we fladze Polski!", Toast.LENGTH_SHORT).show();
    }

    public void dobraOdpowiedz(View view) {
        view.setVisibility(View.INVISIBLE);
        licznik++;
        if(licznik == 4){
            //TODO: zmienić napis
            textViewPolecenie = findViewById(R.id.textViewPolecenie);
            textViewPolecenie.setText("Oto flaga Polski!");
        }
    }
}