package com.example.thefeelwheel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class StressSolutions extends AppCompatActivity {
String sol[]={"1. Exercise\n" +
        "Exercise is one of the most important things you can do to combat stress.\n" +
        "\n" +
        "It might seem contradictory, but putting physical stress on your body through exercise can relieve mental stress.\n" +
        "\n" +
        "The benefits are strongest when you exercise regularly. People who exercise regularly are less likely to experience anxiety than those who don’t exercis",
"2. Consider supplements\n" +
        "Several supplements promote stress and anxiety reduction. Here is a brief overview of some of the most common ones:\n" +
        "\n" +
        "Lemon balm: Lemon balm is a member of the mint family that has been studied for its anti-anxiety effects .\n" +
        "Omega-3 fatty acids: One study showed that medical students who received omega-3 supplements experienced a 20% reduction in anxiety symptoms.\n" +
        "Ashwagandha: Ashwagandha is an herb used in Ayurvedic medicine to treat stress and anxiety. Several studies suggest that it’s effective .\n" +
        "Green tea: Green tea contains many polyphenol antioxidants which provide health benefits. It may lower stress and anxiety by increasing serotonin levels .\n" +
        "Valerian: Valerian root is a popular sleep aid due to its tranquilizing effect. It contains valerenic acid, which alters gamma-aminobutyric acid (GABA) receptors to lower anxiety.\n" +
        "Kava kava: Kava kava is a psychoactive member of the pepper family. Long used as a sedative in the South Pacific, it is increasingly used in Europe and the US to treat mild stress and anxiety",
"3. Light a candle\n" +
        "Using essential oils or burning a scented candle may help reduce your feelings of stress and anxiety.\n" +
        "\n" +
        "Some scents are especially soothing. Here are some of the most calming scents:\n" +
        "\n" +
        "Lavender\n" +
        "Rose\n" +
        "Vetiver\n" +
        "Bergamot",
"4. Reduce your caffeine intake\n" +
        "Caffeine is a stimulant found in coffee, tea, chocolate and energy drinks. High doses can increase anxiety (10Trusted Source).\n" +
        "\n" +
        "People have different thresholds for how much caffeine they can tolerate.",
"5. Write it down\n" +
        "One way to handle stress is to write things down.\n" +
        "\n" +
        "While recording what you’re stressed about is one approach, another is jotting down what you’re grateful for.\n" +
        "\n",
"6. Chew gum\n" +
        "For a super easy and quick stress reliever, try chewing a stick of gum.\n" +
        "\n" +
        "One study showed that people who chewed gum had a greater sense of wellbeing and lower stress (11).\n" +
        "\n" +
        "One possible explanation is that chewing gum causes brain waves similar to those of relaxed people. Another is that chewing gum promotes blood flow to your brain.",
        "7. Spend time with friends and family\n" +
                "Social support from friends and family can help you get through stressful times.\n" +
                "\n" +
                "Being part of a friend network gives you a sense of belonging and self-worth, which can help you in tough times.",
        "8. Laugh\n" +
                "It’s hard to feel anxious when you’re laughing. It’s good for your health, and there are a few ways it may help relieve stress:\n" +
                "\n" +
                "Relieving your stress response.\n" +
                "Relieving tension by relaxing your muscles."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress_solutions);
        ListView lv = (ListView) findViewById(R.id.lv);
        Button btn = (Button) findViewById(R.id.btn);
        ArrayAdapter arrayAdapter=new ArrayAdapter(StressSolutions.this, android.R.layout.simple_list_item_1,sol);
        lv.setAdapter(arrayAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(StressSolutions.this,Contact.class);
                startActivity(i);
            }
        });
    }
}