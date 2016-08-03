package com.example.n56.pokemon;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class PokemonActivity extends AppCompatActivity {
    Pokemon pokemon;
    TextView textView_pokemon_name, getTextView_pokemon_weakness1, getTextView_pokemon_weakness2
            ,getTextView_pokemon_weakness3, getTextView_pokemon_weakness4;
    ImageView imageView_pokemon;

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);

        imageView_pokemon = (ImageView)findViewById(R.id.imageView_pokemon);
        textView_pokemon_name = (TextView)findViewById(R.id.textView_pokemon_name);
        getTextView_pokemon_weakness1 = (TextView)findViewById(R.id.textVew_weakness1);
        getTextView_pokemon_weakness2 = (TextView)findViewById(R.id.textVew_weakness2);
        getTextView_pokemon_weakness3 = (TextView)findViewById(R.id.textVew_weakness3);
        getTextView_pokemon_weakness4 = (TextView)findViewById(R.id.textVew_weakness4);

        pokemon = (Pokemon) getIntent().getSerializableExtra("pokemon");
        imageView_pokemon.setImageResource(pokemon.getImage_id());
        textView_pokemon_name.setText(pokemon.getName());

        if(pokemon.getWeakness1() != null) {
            getTextView_pokemon_weakness1.setText(pokemon.getWeakness1());
            getTextView_pokemon_weakness1.setTextColor(getColor(R.color.white));
            getTextView_pokemon_weakness1.setBackgroundResource(MainActivity.getTypeDrawable(pokemon.getWeakness1()));
        }

        if(pokemon.getWeakness2() != null) {
            getTextView_pokemon_weakness2.setText(pokemon.getWeakness2());
            getTextView_pokemon_weakness2.setTextColor(getColor(R.color.white));
            getTextView_pokemon_weakness2.setBackgroundResource(MainActivity.getTypeDrawable(pokemon.getWeakness2()));
        }

        if(pokemon.getWeakness3() != null) {
            getTextView_pokemon_weakness3.setText(pokemon.getWeakness3());
            getTextView_pokemon_weakness3.setTextColor(getColor(R.color.white));
            getTextView_pokemon_weakness3.setBackgroundResource(MainActivity.getTypeDrawable(pokemon.getWeakness3()));
        }

        if(pokemon.getWeakness4() != null) {
            getTextView_pokemon_weakness4.setText(pokemon.getWeakness4());
            getTextView_pokemon_weakness4.setTextColor(getColor(R.color.white));
            getTextView_pokemon_weakness4.setBackgroundResource(MainActivity.getTypeDrawable(pokemon.getWeakness4()));
        }
    }
}
