package com.example.user.kinematicsolverv2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class graph extends AppCompatActivity {

    LineGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
      /*  Intent i = getIntent();

        String acc = i.getStringExtra("acc");
        System.out.println("HIIIIIIIIIIIIIIII");
        System.out.println(acc); */
      int[] grades = new int[6];
      for(int i = 0; i < grades.length; i++) {
          grades[i] = getIntent().getIntExtra("grades" + i, 0);

      }

      System.out.println(grades[1]);

    }
}


    /*}

        double d,x;
        x = 0;

        GraphView graph = (GraphView) findViewById(R.id.graph);
        series = new LineGraphSeries<DataPoint>();
        for (int i = 0; i < 500; i++ ) {
            x = x + 0.1;
            double vi = 100;
            double a = 200;
            d = (vi * x) + 0.5 * (a * x*x);
            series.appendData(new DataPoint(x,d), true, 500);
        }
        graph.addSeries(series);
        graph.getLegendRenderer().setVisible(true);
        series.setTitle("Graph f(x)");
        graph.getLegendRenderer().setTextSize(50);
        graph.getLegendRenderer().setTextColor(Color.BLACK);
        graph.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);




    }




}*/