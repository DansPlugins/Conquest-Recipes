package conquestrecipesystem.Objects;

import conquestrecipesystem.Main;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Material.*;

public class Cuauhololli {

    Main main = null;

    public Cuauhololli(Main plugin) {
        main = plugin;
    }

    public ItemStack getItemStack(int amount) {
        return main.itemstacks.createItemStack(amount, STONE_SWORD, "Cuauhololli", "A long stick layered with flint blades at the tips.");
    }

    public void registerRecipe() {
        NamespacedKey key = new NamespacedKey(main, "conquest_recipes_cuauhololli");
        ShapedRecipe recipe = new ShapedRecipe(key, getItemStack(1));
        recipe.shape("SIS", "0IF", "0I0");
        recipe.setIngredient('I', new RecipeChoice.ExactChoice(new ItemStack(STICK)));
        recipe.setIngredient('S', new RecipeChoice.ExactChoice(new ItemStack(FLINT)));
        recipe.setIngredient('F', new RecipeChoice.ExactChoice(new ItemStack(STRING)));
        Bukkit.addRecipe(recipe);
    }
}
