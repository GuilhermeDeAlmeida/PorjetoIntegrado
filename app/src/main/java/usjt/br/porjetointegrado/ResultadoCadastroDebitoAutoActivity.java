package usjt.br.porjetointegrado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultadoCadastroDebitoAutoActivity extends AppCompatActivity {

    TextView txtDataDebito, txtValor, txtTipoDeDebito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_cadastro_debito_auto);
        Intent intent = getIntent();
        txtDataDebito = (TextView) findViewById(R.id.txtDataDebito);
        txtValor = (TextView) findViewById(R.id.txtValorDebito);
        txtTipoDeDebito = (TextView) findViewById(R.id.txtTipoDeDebito);

        txtDataDebito.setText(intent.getStringExtra(CadastroDebitoAutoActivity.EXTRA_DATANOVODEBITO));
        txtValor.setText(intent.getStringExtra(CadastroDebitoAutoActivity.EXTRA_VALORNOVODEBITO));
        txtTipoDeDebito.setText(intent.getStringExtra(CadastroDebitoAutoActivity.EXTRA_TIPODEDEBITO));
    }
    public void confirmar(View v){
        Intent intent = new Intent(this, MenuPrincipalActivity.class);
        startActivity(intent);
    }
    @Override
    public void onStart(){
        super.onStart();
    }
    @Override
    public void onRestart(){
        super.onRestart();
    }
    @Override
    public void onResume(){
        super.onResume();
    }
    @Override
    public void onPause(){
        super.onPause();
    }
    @Override
    public void onStop(){
        super.onStop();
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
    }
    public void finish(View view){
        this.finish();

    }
}
