package gasolinaoualcool.cursoandroid.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botaoVerificar;
    private TextView resultado;
    private EditText precoAlcool;
    private EditText precoGasolina;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina= (EditText) findViewById(R.id.precoGasolinaId);
        botaoVerificar = (Button) findViewById(R.id.btnVerificarId);
        resultado = (TextView) findViewById(R.id.resultadoFinalId);


        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Le valores digitados no app
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                //Converter valores string pra double
                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                //calculos
                Double resultadoConta = valorAlcool/valorGasolina;

                if(resultadoConta > 0.7){
                    resultado.setText("Compensa Utilizar a Gasolina");
                }else{
                    resultado.setText("Compensa utilizar o Alcool");

                }


            }
        });


    }
}
