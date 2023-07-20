package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Recipeactmain extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipeactmain);

        mRecyclerView=(RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(Recipeactmain.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myFoodList=new ArrayList<>();


        mFoodData=new FoodData("JELEBI","\n"+"Recipe:\n\n 1.In a mixing bowl, mix maida, corn flour, curd.\n\n" +
                "2.Then add half tsp vinegar and water.\n\n" +
                "3.Mix well in round circular directions for 4 minutes.\n\n" +
                "4.Now add baking soda and give a gentle mix.\n\n" +
                "5.Now pour this batter in the tomato ketchup bottles carefully.\n\n" +
                "6.Heat oil in a pan and add 1 tbsp of ghee.\n\n" +
                "7.Squeeze the bottle and make round spirals with the batter.\n\n" +
                "8.When one side is partly cooked, turn over and fry the other side.\n\n" +
                "9.Fry till the jalebis are a light golden.\n\n" +
                "10.Then immediately drop the fried jalebis in the warm sugar syrup for 30 seconds (1 string consistency).\n\n" +
                "11.Finally, serve jalebis hot, warm or at room temperature.",R.drawable.jelebi);
        myFoodList.add(mFoodData);

        mFoodData=new FoodData("SAMOSA","\n"+"Recipe:\n\n 1.Mix flour, water, oil, salt and red chilli powder to make dough.\n\n" +
                "2.It should not be very soft. Leave aside for 15 minutes.\n\n" +
                "3.Heat two tsp oil and add potatoes and peas. Cover on low flame for 5 minutes.\n\n" +
                "4.Add garam masala, pepper, amchur and jeera powder, mix well and again cover for 5-8 minutes.\n\n" +
                "5.Add cashew nuts and resins in the end and keep on flame for 3-5 minutes.\n\n" +
                "6.Keep aside to cool.\n\n" +
                "7.Roll small balls of the dough like chapati.\n\n" +
                "8.Cut each in two parts (like semi-circle), then take one semi circle and fold it in the shape of a cone. Use water while doing so.\n\n" +
                "9.Stuff the mixture of potatoes, peas and spices in that cone and seal it by taking a drop of water on your finger.\n\n" +
                "10.Heat oil and fry.\n\n" +
                "11.Serve hot with tamarind chutney or green chutney.",R.drawable.samosa);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("PANI-PURI","\n"+"Recipe:\n\n 1.Rinse coriander and mint leaves in water and take all the ingredients of pani.\n\n" +
                "2.Add mint leaves, coriander leaves, green chilli, ginger and lemon juice (lemon juice is added while grinding to prevent the mint leaves from turning dark) in the small chutney jar of a grinder.\n\n" +
                "3.Grind until smooth paste (if required, add 1/4 cup water while grinding).\n\n" +
                "4.Transfer them to a large bowl and add sugar, chaat masala powder, black salt and 4 cups water. Stir with a large spoon and mix it properly. \n\n" +
                "5.Taste for the salt and add as required. Pani is ready; place it in a refrigerator for at least 1-hour before serving or use it at room temperature. If you like soft boondi, mix it now. If you like crispy taste of boondi then mix it at the time of serving.\n\n" +
                "6.Take mashed potato, kala chana, red chilli powder, cumin-coriander powder, chaat masala powder, coriander leaves and salt (add only if you have not added while boiling the potatoes and chana) in a bowl.\n\n" +
                "7.Mix them together with a spoon. Masala is ready.\n\n" +
                "8.Take each puri and gently make a large hole on its top-middle side with a spoon or your index finger or thumb for stuffing.\n\n" +
                "9.Stuff it with masala (more or less, as you like). Sprinkle onion and sev over it and drizzle a drop of date tamarind chutney over it. Take pani-puri water in a medium bowl.\n\n" +
                "10.Finally, serve tasty PaniPuri,  Dip each puri in water and enjoy",R.drawable.panipuri);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("RASMALAI","\n"+"Recipe:\n\n 1.Make fresh paneer (chhena) using 1-liter milk and 2 tablespoons lemon juice. Take a clean muslin cloth or cheesecloth and tie chhena in it. \n\n" +
                "2.Squeeze it gently to remove excess water and hang it over the hook (or tap) for around 30-45 minutes to drain the excess water. – See detailed steps (1 to 5).\n\n" +
                "3.After about 30 minutes, untie the muslin cloth and transfer chhena to a plate.\n\n" +
                "4.Crumble the chhena with hand. It should be crumbly yet little moist. If it has too much moisture, rasmalai may break while cooking. To remove excess moisture, press chenna gently between paper napkins.\n\n" +
                "5.Mash and knead crumbled chhena with hand until it comes together and turns into dough. Stop kneading when your palm starts to turn greasy – it will take around 5-8 minutes depending on the quality and quantity of chhena prepared from milk.\n\n" +
                "6.Divide it into 12 equal portions. Make a small ball from each portion, press it gently between your palms to flatten it and turn into round pattie.\n\n" +
                "7.Pattie should be thick; do not press it too much otherwise it may turn thin from sides and it will break from sides while cooking.\n\n" +
                "8.Cover pan with a lid (if using pressure cooker, remove whistle and rubber ring from the lid and then cover it) and boil for 5-minutes over medium flame. After about 5-minutes, open the lid and flip each pattie gently with a spatula.\n\n" +
                "9.Lets start to make Rabri – pour 1-liter milk in a heavy based pan (thick bottomed pan) and heat it over medium flame. When it comes to rolling boil, reduce flame to low and add saffron strands.\n\n" +
                "10.Increase flame to medium, stir continuously and cook for around 3-4 minutes until sugar dissolves. Add drained patties and chopped pistachio.\n\n" +
                "11.Cook for 4-5 minutes. This helps pattie absorb the milk and get the flavor from inside as well.\n\n" +
                "12.Turn off the flame and transfer it to serving bowl. Let it cool to room temperature and then place it in refrigerator for at least 2-3 hours.\n\n" +
                "13.Serve chilled ras malai as a dessert",R.drawable.rasmalai);
        myFoodList.add(mFoodData);





        MyAdapter myAdapter=new MyAdapter(Recipeactmain.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);
    }
}