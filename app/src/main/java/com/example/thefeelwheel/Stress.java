package com.example.thefeelwheel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Stress extends AppCompatActivity {
ListView lv;
Button btn;
String type[]={"1. Acute Stress: cute stress happens to everyone. It’s the body’s immediate reaction to a new and challenging situation. It’s the kind of stress you might feel when you narrowly escape a car accident.\n" +
        "\n" +
        "Acute stress can also come out of something that you actually enjoy. It’s the somewhat-frightening, yet thrilling feeling you get on a roller coaster or when skiing down a steep mountain slope.\n" +
        "\n" +
        "These incidents of acute stress don’t normally do you any harm. They might even be good for you. Stressful situations give your body and brain practice in developing the best response to future stressful situations.\n" +
        "\n" +
        "Once the danger passes, your body systems should return to normal. ",
                "2. Episodic acute stress is when you have frequent episodes of acute stress.\n" +
                        "\n" +
                        "This might happen if you’re often anxious and worried about things you suspect may happen. You might feel that your life is chaotic and you seemingly go from one crisis to the next.\n" +
                        "\n" +
                        "Certain professions, such as law enforcement or firefighters, might also lead to frequent high-stress situations.",
                "3. When you have high-stress levels for an extended period of time, you have chronic stress. Long-term stress like this can have a negative impact on your health. It may contribute to:\n" +
                        "\n" +
                        "anxiety\n" +
                        "cardiovascular disease\n" +
                        "depression\n" +
                        "high blood pressure\n" +
                        "a weakened immune system\n" +
                        "Chronic stress can also lead to frequent ailments such as headaches, an upset stomach, and sleep difficulties. Gaining insights into the different types of stress and how to recognize them may help."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress);
        lv=(ListView)findViewById(R.id.lv);
        btn=(Button)findViewById(R.id.btn);
        ArrayAdapter arrayAdapter=new ArrayAdapter(Stress.this, android.R.layout.simple_list_item_1,type);
        lv.setAdapter(arrayAdapter);
    btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i =new Intent(Stress.this,StressSolutions.class);
        startActivity(i);
    }
});
    }
}