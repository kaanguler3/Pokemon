package com.example.n56.pokemon;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SearchView searchView;
    ListView listView_pokemons;

    PokemonListAdapter pokemonListAdapter;

    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializePokemonList();
        listView_pokemons = (ListView)findViewById(R.id.listView_pokemons);
        populatePokemonListView();
    }

    public void populatePokemonListView() {
        pokemonListAdapter = new PokemonListAdapter(getApplicationContext(), pokemons);
        listView_pokemons.setAdapter(pokemonListAdapter);
    }

    public class PokemonListAdapter extends ArrayAdapter<Pokemon> {

        public PokemonListAdapter(Context context, ArrayList<Pokemon> pokemons) {
            super(context, 0, pokemons);
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            final Pokemon pokemon = getItem(position);

            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_pokemon_item, parent, false);
            }

            ImageView imageView_pokemon = (ImageView) convertView.findViewById(R.id.imageView_pokemon);
            TextView textView_name = (TextView) convertView.findViewById(R.id.textView_pokemon_name);
            TextView textView_type1 = (TextView) convertView.findViewById(R.id.textView_pokemon_type1);
            TextView textView_type2 = (TextView) convertView.findViewById(R.id.textView_pokemon_type2);
            textView_type2.setVisibility(View.GONE);

            imageView_pokemon.setImageResource(pokemon.getImage_id());
            textView_name.setText(pokemon.getName());

            String type1 = pokemon.getType1();
            String type2 = pokemon.getType2();

            textView_type1.setText(type1);
            textView_type1.setTextColor(getColor(R.color.white));
            textView_type1.setBackgroundResource(getTypeDrawable(type1));
            if(type2 != null){
                textView_type2.setVisibility(View.VISIBLE);
                textView_type2.setTextColor(getColor(R.color.white));
                textView_type2.setText(type2);
                textView_type2.setBackgroundResource(getTypeDrawable(type2));
            }

            Log.i("pokemon :" , pokemon.getName() + " " + pokemon.getType1() + " " + pokemon.getType2());

            imageView_pokemon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), PokemonActivity.class);
                    intent.putExtra("pokemon", pokemon);
                    startActivity(intent);
                }
            });

            return convertView;
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    public static int getTypeDrawable(String type){
        switch (type){
            case "Fire":
                return R.drawable.fire;
            case "Water":
                return R.drawable.water;
            case "Grass":
                return R.drawable.grass;
            case "Electric":
                return R.drawable.electric;
            case "Rock":
                return R.drawable.rock;
            case "Ground":
                return R.drawable.ground;
            case "Poison":
                return R.drawable.posion;
            case "Flying":
                return R.drawable.flying;
            case "Bug":
                return R.drawable.bug;
            case "Normal":
                return R.drawable.normal;
            case "fighting":
                return R.drawable.fighting;
            case "Psychic":
                return R.drawable.psychic;
            case "Ice":
                return R.drawable.ice;
        }
        return R.drawable.water;
    }

    public void initializePokemonList(){
        Pokemon bulbasaur = new Pokemon(R.drawable.bulbasaur, "Bulbasaur");
        bulbasaur.setType1("Grass");
        bulbasaur.setType2("Poison");
        bulbasaur.setWeakness1("Fire");
        bulbasaur.setWeakness2("Flying");
        bulbasaur.setWeakness3("Ice");
        bulbasaur.setWeakness4("Psychic");
        this.pokemons.add(bulbasaur);


        Pokemon ivysaur = new Pokemon(R.drawable.ivysaur, "Ivysaur");
        ivysaur.setType1("Grass");
        ivysaur.setType2("Poison");
        ivysaur.setWeakness1("Fire");
        ivysaur.setWeakness2("Flying");
        ivysaur.setWeakness3("Ice");
        ivysaur.setWeakness4("Psychic");
        this.pokemons.add(ivysaur);


        Pokemon venusaur = new Pokemon(R.drawable.venusaur, "Venusaur");
        venusaur.setType1("Grass");
        venusaur.setType2("Poison");
        venusaur.setWeakness1("Fire");
        venusaur.setWeakness2("Flying");
        venusaur.setWeakness3("Ice");
        venusaur.setWeakness4("Psychic");
        this.pokemons.add(venusaur);

        Pokemon charmander = new Pokemon(R.drawable.charmander, "Charmander");
        charmander.setType1("Fire");
        charmander.setWeakness1("Ground");
        charmander.setWeakness2("Rock");
        charmander.setWeakness3("Water");
        this.pokemons.add(charmander);

        Pokemon charmeleon = new Pokemon(R.drawable.charmeleon, "Charmeleon");
        charmeleon.setType1("Fire");
        charmeleon.setWeakness1("Ground");
        charmeleon.setWeakness2("Rock");
        charmeleon.setWeakness3("Water");
        this.pokemons.add(charmeleon);


        Pokemon charizard = new Pokemon(R.drawable.charizard, "Charizard");
        charizard.setType1("Fire");
        charizard.setWeakness1("Rock");
        charizard.setWeakness2("Electric");
        charizard.setWeakness3("Water");
        this.pokemons.add(charizard);

        Pokemon Squirtle = new Pokemon(R.drawable.squirtle, "Squirtle");
        Squirtle.setType1("Fire");
        Squirtle.setWeakness1("Electric");
        Squirtle.setWeakness2("Grass");
        this.pokemons.add(Squirtle);

        Pokemon Wartortle = new Pokemon(R.drawable.wartortle, "Wartortle");
        Wartortle.setType1("Fire");
        Wartortle.setWeakness1("Electric");
        Wartortle.setWeakness2("Grass");
        this.pokemons.add(Wartortle);

        Pokemon Blastoise = new Pokemon(R.drawable.blastoise, "Blastoise");
        Blastoise.setType1("Fire");
        Blastoise.setWeakness1("Electric");
        Blastoise.setWeakness2("Grass");
        this.pokemons.add(Blastoise);

        Pokemon Caterpie = new Pokemon(R.drawable.caterpie, "Caterpie");
        Caterpie.setType1("Bug");
        Caterpie.setWeakness1("Fire");
        Caterpie.setWeakness2("Flying");
        Caterpie.setWeakness3("Rock");
        this.pokemons.add(Caterpie);

        Pokemon Metapod = new Pokemon(R.drawable.metapod, "Metapod");
        Metapod.setType1("Bug");
        Metapod.setWeakness1("Fire");
        Metapod.setWeakness2("Flying");
        Metapod.setWeakness3("Rock");
        this.pokemons.add(Metapod);

        ////// BİR TANE DAHA WEAKNESSI WAR!
        Pokemon Butterfree = new Pokemon(R.drawable.butterfree, "Butterfree");
        Butterfree.setType1("Bug");
        Butterfree.setType2("Flying");
        Butterfree.setWeakness1("Rock");
        Butterfree.setWeakness2("Electric");
        Butterfree.setWeakness3("Fire");
        Butterfree.setWeakness4("Flying");
        ///+ ice
        this.pokemons.add(Butterfree);
    }
}
