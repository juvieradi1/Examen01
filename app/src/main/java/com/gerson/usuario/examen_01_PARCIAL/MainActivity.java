package com.gerson.usuario.examen_01_PARCIAL;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;




public class MainActivity extends ActionBarActivity {

    Button comida1;
    Button comida2;
    Button comida3;
    Button comida4;
    Button comida5;
    Button comida6;
    ListView lista;
    String[] restaurant = {
            "Arroz con pato $4.00",
            "Causa rellena $10.00",
            "Ceviche $10.00",
            "Chicharron $5.00",
            "Cuy con papas $15.00",
            "Lomo saltado $5.00"

    };


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            ActionBar actionBar = getSupportActionBar();


            comida1 = (Button) findViewById(R.id.bt1);


            comida1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent pantallaIntrucciones = new Intent(getApplicationContext(), Comida6.class);
                    startActivity(pantallaIntrucciones);
                }
            });
            comida2 = (Button) findViewById(R.id.bt2);


            comida2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View a) {

                    Intent pantallaIntrucciones = new Intent(getApplicationContext(), Comida2.class);
                    startActivity(pantallaIntrucciones);
                }
            });

            comida3 = (Button) findViewById(R.id.bt3);


            comida3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View a) {

                    Intent pantallaIntrucciones = new Intent(getApplicationContext(), Comida5.class);
                    startActivity(pantallaIntrucciones);
                }
            });
            comida4 = (Button) findViewById(R.id.bt4);


            comida4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View a) {

                    Intent pantallaIntrucciones = new Intent(getApplicationContext(), Comida6.class);
                    startActivity(pantallaIntrucciones);
                }
            });
            comida5 = (Button) findViewById(R.id.bt5);


            comida5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View a) {

                    Intent pantallaIntrucciones = new Intent(getApplicationContext(), Comida6.class);
                    startActivity(pantallaIntrucciones);
                }
            });
            comida6 = (Button) findViewById(R.id.bt6);


            comida6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View a) {

                    Intent pantallaIntrucciones = new Intent(getApplicationContext(), Comida4.class);
                    startActivity(pantallaIntrucciones);
                }
            });






            lista = (ListView) findViewById(R.id.Lista);

            ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurant);

            lista.setAdapter(adaptador);
            lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
                    //Toast.makeText(getApplicationContext(), "posicion " + (i + 1) + personas[i], Toast.LENGTH_SHORT).show();
                    switch (posicion) {
                        case 0:
                            Intent ii = new Intent(getApplicationContext(), Comida5.class);
                            startActivity(ii);
                            break;
                        case 1:
                            Intent iii = new Intent(getApplicationContext(), Comida2.class);
                            startActivity(iii);

                            break;
                        case 2:
                            Intent iiii = new Intent(getApplicationContext(), Comida4.class);
                            startActivity(iiii);

                            break;
                        case 3:
                            Intent iiiii = new Intent(getApplicationContext(), Comida3.class);
                            startActivity(iiiii);

                            break;
                        case 4:
                            Intent iiiiii = new Intent(getApplicationContext(), Comida1.class);
                            startActivity(iiiiii);

                            break;
                        case 5:
                            Intent iiiiiii = new Intent(getApplicationContext(), Comida6.class);
                            startActivity(iiiiiii);

                            break;
                        default:
                            Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                    }
                }
            });


            Resources res = getResources();

            TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
            tabs.setup();

            TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
            spec.setContent(R.id.Inicio);
            spec.setIndicator("Inicio");
            Toast cl = Toast.makeText(getApplicationContext(), "bienvenido a inicio", Toast.LENGTH_SHORT);
            cl.show();
            tabs.addTab(spec);


            spec=tabs.newTabSpec("mitab2");
            spec.setContent(R.id.Platos1);
            spec.setIndicator("Platos1");
            tabs.addTab(spec);

            spec=tabs.newTabSpec("mitab3");
            spec.setContent(R.id.Platos2);
            spec.setIndicator("Platos2");
            tabs.addTab(spec);

            tabs.setCurrentTab(0);

        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.action_settings:  return true;
            case R.id.action_setting:
                return true;
            case R.id.inicio:
                Intent main = new Intent(this, MainActivity.class);
                startActivity(main);
                return true;


            case R.id.opcion1:
                Intent opc1 = new Intent(this, Opcion1Activity.class);
                startActivity(opc1);
                return true;
            case R.id.opcion2:
                Intent opc2 = new Intent(this, Opcion2Activity.class);
                startActivity(opc2);
                return true;
            case R.id.opcion3:
                Intent opc3 = new Intent(this, Opcion3Activity.class);
                startActivity(opc3);
                return true;
            case R.id.opcion4:
                Intent opc4 = new Intent(this, Opcion4Activity.class);
                startActivity(opc4);
                return true;
            case R.id.opcion1_1:
                Intent opc1_1 = new Intent(this, Opcion1_1Activity.class);
                startActivity(opc1_1);
                return true;

            case R.id.opcion2_2:
                Intent opc2_2 = new Intent(this, Opcion2_2Activity.class);
                startActivity(opc2_2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void Tacacho (View view) {
        startActivity(new Intent(this, Comida5.class));

    }
    public void Tallarines (View view) {
        startActivity(new Intent(this, Comida6.class));

    }
    public void Saltado (View view) {
        startActivity(new Intent(this, Comida4.class));

    }
    public void Juane (View view) {
        startActivity(new Intent(this, Comida3.class));

    }
    public void Ceviche (View view) {
        startActivity(new Intent(this, Comida1.class));

    }
    public void Chaufa (View view) {
        startActivity(new Intent(this, Comida2.class));

    }


}
