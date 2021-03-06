package conquestrecipesystem.Objects;

import conquestrecipesystem.Main;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Material.*;
import static org.bukkit.Material.COBBLESTONE;

public class RootCleaver {

    Main main = null;

    public RootCleaver(Main plugin) {
        main = plugin;
    }

    public ItemStack getItemStack(int amount) {
        return main.itemstacks.createItemStack(amount, STONE_SWORD, "Stone Root Cleaver", "A cleaver made of stone with a root handle.");
    }

    public void registerRecipe() {
        NamespacedKey key = new NamespacedKey(main, "conquest_recipes_root_cleaver");
        ShapedRecipe recipe = new ShapedRecipe(key, getItemStack(1));
        recipe.shape("0BB", "0BI", "0I0");
        recipe.setIngredient('I', new RecipeChoice.ExactChoice(main.itemstacks.getItemStack("Roots", 1)));
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(new ItemStack(COBBLESTONE)));
        Bukkit.addRecipe(recipe);
    }
}
