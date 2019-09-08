package matc89.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static String texto = "Mundo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.start();
    }

    private void start() {

        TextView textView = (TextView) findViewById(R.id.labelMensagem);
        textView.setText("Alô, " + MainActivity.texto + "!");

    }

    public void mudar_texto(View view){

        EditText editText = (EditText) findViewById(R.id.editNome);
        MainActivity.texto = editText.getText().toString();

        this.start();
    }
}
