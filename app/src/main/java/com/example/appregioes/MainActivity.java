package com.example.appregioes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private LinearLayout layoutContainer;
    private TextView tvRegiao;
    private TextView tvEstados;
    private String[] regiao;
    private String[][] estado;
    private ImageView ivTop, ivBottom;
    private int contador, contadorEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutContainer = (LinearLayout) findViewById(R.id.LayoutContainer);
        tvRegiao =  (TextView) findViewById(R.id.tvRegiao);
        tvEstados = (TextView) findViewById(R.id.tvEstados);
        ivTop = (ImageView) findViewById(R.id.ivTop);
        ivBottom = (ImageView) findViewById(R.id.ivBottom);
        contador = 0;

        regiao = new String[] {
                "Sul",
                "Norte",
                "Sudeste",
                "Nordeste",
                "Centro-Oeste"
        };

        tvRegiao.setText(regiao[contador]);

        layoutContainer.setOnTouchListener( new OnSwipeTouchListener(this){

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
            }

            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
                contador ++;
                if (contador >= regiao.length){
                    contador = 0;
                }
                tvRegiao.setText(regiao[contador]);
            }

            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
                contador --;
                if(contador < 0 ){
                    contador = regiao.length-1;
                }
                tvRegiao.setText( regiao[contador]);
            }
        });


    }
}
