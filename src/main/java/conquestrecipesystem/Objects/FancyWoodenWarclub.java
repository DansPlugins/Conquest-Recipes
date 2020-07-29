package conquestrecipesystem.Objects;

import conquestrecipesystem.Main;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Material.*;
import static org.bukkit.Material.BONE;

public class FancyWoodenWarclub {

    Main main = null;

    public FancyWoodenWarclub(Main plugin) {
        main = plugin;
    }

    public ItemStack getItemStack(int amount) {
        return main.itemstacks.createItemStack(amount, WOODEN_SWORD, "Fancy Wooden Warclub", "A club made of the finest primitive materials");
    }

    public void registerRecipe() {
        NamespacedKey key1 = new NamespacedKey(main, "conquest_recipes_fancy_wooden_warclub_1");
        ShapedRecipe recipe1 = new ShapedRecipe(key1, getItemStack(1));
        recipe1.shape("0BB", "0IF", "I00");
        recipe1.setIngredient('I', STICK);
        recipe1.setIngredient('F', STRING);
        recipe1.setIngredient('B', STRIPPED_OAK_LOG);
        Bukkit.addRecipe(recipe1);
        NamespacedKey key2 = new NamespacedKey(main, "conquest_recipes_fancy_wooden_warclub_2");
        ShapedRecipe recipe2 = new ShapedRecipe(key2, getItemStack(1));
        recipe2.shape("0BB", "0IF", "I00");
        recipe2.setIngredient('B', STRIPPED_BIRCH_LOG);
        recipe2.setIngredient('I', STICK);
        recipe2.setIngredient('F', STRING);
        Bukkit.addRecipe(recipe2);
        NamespacedKey key3 = new NamespacedKey(main, "conquest_recipes_fancy_wooden_warclub_3");
        ShapedRecipe recipe3 = new ShapedRecipe(key3, getItemStack(1));
        recipe3.shape("0BB", "0IF", "I00");
        recipe3.setIngredient('B', STRIPPED_SPRUCE_LOG);
        recipe3.setIngredient('I', STICK);
        recipe3.setIngredient('F', STRING);
        Bukkit.addRecipe(recipe3);
        NamespacedKey key4 = new NamespacedKey(main, "conquest_recipes_fancy_wooden_warclub_4");
        ShapedRecipe recipe4 = new ShapedRecipe(key4, getItemStack(1));
        recipe4.shape("0BB", "0IF", "I00");
        recipe4.setIngredient('B', STRIPPED_JUNGLE_LOG);
        recipe4.setIngredient('I', STICK);
        recipe4.setIngredient('F', STRING);
        Bukkit.addRecipe(recipe4);
        NamespacedKey key5 = new NamespacedKey(main, "conquest_recipes_fancy_wooden_warclub_5");
        ShapedRecipe recipe5 = new ShapedRecipe(key5, getItemStack(1));
        recipe5.shape("0BB", "0IF", "I00");
        recipe5.setIngredient('B', STRIPPED_ACACIA_LOG);
        recipe5.setIngredient('I', STICK);
        recipe5.setIngredient('F', STRING);
        Bukkit.addRecipe(recipe5);
        NamespacedKey key6 = new NamespacedKey(main, "conquest_recipes_fancy_wooden_warclub_6");
        ShapedRecipe recipe6 = new ShapedRecipe(key6, getItemStack(1));
        recipe6.shape("0BB", "0IF", "I00");
        recipe6.setIngredient('B', STRIPPED_DARK_OAK_LOG);
        recipe6.setIngredient('I', STICK);
        recipe6.setIngredient('F', STRING);
        Bukkit.addRecipe(recipe6);
        NamespacedKey key7 = new NamespacedKey(main, "conquest_recipes_fancy_wooden_warclub_7");
        ShapedRecipe recipe7 = new ShapedRecipe(key7, getItemStack(1));
        recipe7.shape("0BB", "0IF", "I00");
        recipe7.setIngredient('B', STRIPPED_CRIMSON_STEM);
        recipe7.setIngredient('I', STICK);
        recipe7.setIngredient('F', STRING);
        Bukkit.addRecipe(recipe7);
        NamespacedKey key8 = new NamespacedKey(main, "conquest_recipes_fancy_wooden_warclub_8");
        ShapedRecipe recipe8 = new ShapedRecipe(key8, getItemStack(1));
        recipe8.shape("0BB", "0IF", "I00");
        recipe8.setIngredient('B', STRIPPED_WARPED_STEM);
        recipe8.setIngredient('I', STICK);
        recipe8.setIngredient('F', STRING);
        Bukkit.addRecipe(recipe8);
    }
}
