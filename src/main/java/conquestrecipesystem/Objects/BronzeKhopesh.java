package conquestrecipesystem.Objects;

import conquestrecipesystem.Main;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Material.IRON_SWORD;
import static org.bukkit.Material.STICK;

public class BronzeKhopesh {

    Main main = null;

    public BronzeKhopesh(Main plugin) {
        main = plugin;
    }

    public ItemStack getItemStack(int amount) {
        return main.itemstacks.createItemStack(amount, IRON_SWORD, "Bronze Khopesh", "A unique sword, favored by those of the deserts.");
    }

    public void registerRecipe() {
        NamespacedKey key = new NamespacedKey(main, "conquest_recipes_bronze_khopesh");
        ShapedRecipe recipe = new ShapedRecipe(key, getItemStack(1));
        recipe.shape("0SS", "0S0", "I00");
        recipe.setIngredient('I', new RecipeChoice.ExactChoice(new ItemStack(STICK)));
        recipe.setIngredient('S', new RecipeChoice.ExactChoice(main.itemstacks.getItemStack("BronzeIngot", 1)));
        Bukkit.addRecipe(recipe);
    }
}
