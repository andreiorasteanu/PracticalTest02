package ro.pub.cs.systems.eim.practicaltest02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PracticalTest02MainActivity extends AppCompatActivity {

    EditText numePokemon;
    Button cerere;
    ImageView imageView;
    TextView atribute;
    TextView tipuri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test02_main);
        numePokemon = findViewById(R.id.numePokemon);
        cerere = findViewById(R.id.cerere);
        imageView = findViewById(R.id.image);
        atribute = findViewById(R.id.atribute);
        tipuri = findViewById(R.id.tipuri);
    }
}
