package conquestrecipesystem.Subsystems;

import conquestrecipesystem.Main;
import conquestrecipesystem.Objects.*;

public class RecipeSubsystem {

    Main main = null;

    public RecipeSubsystem(Main plugin) {
        main = plugin;
    }

    public void registerRecipes() {

        SteelIngot steelIngot = new SteelIngot(main);
        steelIngot.registerRecipe();

        SimpleBlowgun simpleBlowgun = new SimpleBlowgun(main);
        simpleBlowgun.registerRecipe();

        Dart dart = new Dart(main);
        dart.registerRecipe();

        SharpenedBamboo sharpenedBamboo = new SharpenedBamboo(main);
        sharpenedBamboo.registerRecipe();

        LargeWoodenClub largeWoodenClub = new LargeWoodenClub(main);
        largeWoodenClub.registerRecipe();

        PrimitiveFishingSpear primitiveFishingSpear = new PrimitiveFishingSpear(main);
        primitiveFishingSpear.registerRecipe();

        PrimitiveHuntingSpear primitiveHuntingSpear = new PrimitiveHuntingSpear(main);
        primitiveHuntingSpear.registerRecipe();

        Stonespear stonespear = new Stonespear(main);
        stonespear.registerRecipe();

        Boneclub boneclub = new Boneclub(main);
        boneclub.registerRecipe();

        SharpenedPole sharpenedPole = new SharpenedPole(main);
        sharpenedPole.registerRecipe();

        SmallWoodenClub smallWoodenClub = new SmallWoodenClub(main);
        smallWoodenClub.registerRecipe();

        SpikedHalberd spikedHalberd = new SpikedHalberd(main);
        spikedHalberd.registerRecipe();

        FancyWoodenWarclub fancyWoodenWarclub = new FancyWoodenWarclub(main);
        fancyWoodenWarclub.registerRecipe();

        PrimitiveWarhammer primitiveWarhammer = new PrimitiveWarhammer(main);
        primitiveWarhammer.registerRecipe();

        SpikedClub spikedClub = new SpikedClub(main);
        spikedClub.registerRecipe();

        SteelLongsword steelLongsword = new SteelLongsword(main);
        steelLongsword.registerRecipe();

        SteelBastardsword steelBastardsword = new SteelBastardsword(main);
        steelBastardsword.registerRecipe();

        PrimitiveFlail primitiveFlail = new PrimitiveFlail(main);
        primitiveFlail.registerRecipe();

        SpikedHatchet spikedHatchet = new SpikedHatchet(main);
        spikedHatchet.registerRecipe();

        PrimitiveStoneblade primitiveStoneblade = new PrimitiveStoneblade(main);
        primitiveStoneblade.registerRecipe();

        RootCleaver rootCleaver = new RootCleaver(main);
        rootCleaver.registerRecipe();

        RootDagger rootDagger = new RootDagger(main);
        rootDagger.registerRecipe();

        BigMacuahuitl bigMacuahuitl = new BigMacuahuitl(main);
        bigMacuahuitl.registerRecipe();

        Cuauhololli cuauhololli = new Cuauhololli(main);
        cuauhololli.registerRecipe();

        FeatheredMacuahuitl featheredMacuahuitl = new FeatheredMacuahuitl(main);
        featheredMacuahuitl.registerRecipe();

        SmallMacuahuitl smallMacuahuitl = new SmallMacuahuitl(main);
        smallMacuahuitl.registerRecipe();

        Tepoztopilli tepoztopilli = new Tepoztopilli(main);
        tepoztopilli.registerRecipe();

        StoneHalberd stoneHalberd = new StoneHalberd(main);
        stoneHalberd.registerRecipe();

        Roots roots = new Roots(main);
        roots.registerRecipe();

        BonePlateBoots bonePlateBoots = new BonePlateBoots(main);
        bonePlateBoots.registerRecipe();

        BonePlateChestplate bonePlateChestplate = new BonePlateChestplate(main);
        bonePlateChestplate.registerRecipe();

        BonePlateHelm bonePlateHelm = new BonePlateHelm(main);
        bonePlateHelm.registerRecipe();

        BonePlateLeggings bonePlateLeggings = new BonePlateLeggings(main);
        bonePlateLeggings.registerRecipe();

        BoneShield boneShield = new BoneShield(main);
        boneShield.registerRecipe();

        AfricanTallShield africanTallShield = new AfricanTallShield(main);
        africanTallShield.registerRecipe();

        DecoratedChimalliShield decoratedChimalliShield = new DecoratedChimalliShield(main);
        decoratedChimalliShield.registerRecipe();

        SpiralChimalliShield spiralChimalliShield = new SpiralChimalliShield(main);
        spiralChimalliShield.registerRecipe();

        SkeletalSkull skeletalSkull = new SkeletalSkull(main);
        skeletalSkull.registerRecipe();

        SkeletalChest skeletalChest = new SkeletalChest(main);
        skeletalChest.registerRecipe();

        SkeletalLegs skeletalLegs = new SkeletalLegs(main);
        skeletalLegs.registerRecipe();

        SkeletalFeet skeletalFeet = new SkeletalFeet(main);
        skeletalFeet.registerRecipe();

        RootmossClothHelmet rootmossClothHelmet = new RootmossClothHelmet(main);
        rootmossClothHelmet.registerRecipe();

        RootmossClothChestpiece rootmossClothChestpiece = new RootmossClothChestpiece(main);
        rootmossClothChestpiece.registerRecipe();

        RootmossClothLeggings rootmossClothLeggings = new RootmossClothLeggings(main);
        rootmossClothLeggings.registerRecipe();

        RootmossClothShoes rootmossClothShoes = new RootmossClothShoes(main);
        rootmossClothShoes.registerRecipe();

        Copper copper = new Copper(main);
        copper.registerRecipe();

        Tin tin = new Tin(main);
        tin.registerRecipe();

        BronzeIngot bronzeIngot = new BronzeIngot(main);
        bronzeIngot.registerRecipe();

        BronzeAxesword bronzeAxesword = new BronzeAxesword(main);
        bronzeAxesword.registerRecipe();

        BronzeBlade bronzeBlade = new BronzeBlade(main);
        bronzeBlade.registerRecipe();

        BronzeCorinthianHelmet bronzeCorinthianHelmet = new BronzeCorinthianHelmet(main);
        bronzeCorinthianHelmet.registerRecipe();

        BronzeDagger bronzeDagger = new BronzeDagger(main);
        bronzeDagger.registerRecipe();

        BronzeFancyFlail bronzeFancyFlail = new BronzeFancyFlail(main);
        bronzeFancyFlail.registerRecipe();

        BronzeGladiatorHelmet bronzeGladiatorHelmet = new BronzeGladiatorHelmet(main);
        bronzeGladiatorHelmet.registerRecipe();

        BronzeGlaive bronzeGlaive = new BronzeGlaive(main);
        bronzeGlaive.registerRecipe();

        BronzeGreatsword bronzeGreatsword = new BronzeGreatsword(main);
        bronzeGreatsword.registerRecipe();

        BronzeHatchet bronzeHatchet = new BronzeHatchet(main);
        bronzeHatchet.registerRecipe();

        BronzeKhopesh bronzeKhopesh = new BronzeKhopesh(main);
        bronzeKhopesh.registerRecipe();

        BronzePickaxe bronzePickaxe = new BronzePickaxe(main);
        bronzePickaxe.registerRecipe();

        BronzeSpade bronzeSpade = new BronzeSpade(main);
        bronzeSpade.registerRecipe();

        CleanHopliteShield cleanHopliteShield = new CleanHopliteShield(main);
        cleanHopliteShield.registerRecipe();

        FancyBronzeHelmet fancyBronzeHelmet = new FancyBronzeHelmet(main);
        fancyBronzeHelmet.registerRecipe();

        GreatBronzeaxe greatBronzeaxe = new GreatBronzeaxe(main);
        greatBronzeaxe.registerRecipe();

        GreekPlateChestpiece greekPlateChestpiece = new GreekPlateChestpiece(main);
        greekPlateChestpiece.registerRecipe();

        GreekPlateGreaves greekPlateGreaves = new GreekPlateGreaves(main);
        greekPlateGreaves.registerRecipe();

        GreekPlateHelm greekPlateHelm = new GreekPlateHelm(main);
        greekPlateHelm.registerRecipe();

        GreekPlateSabatons greekPlateSabatons = new GreekPlateSabatons(main);
        greekPlateSabatons.registerRecipe();

        Strawhat strawhat = new Strawhat(main);
        strawhat.registerRecipe();

        EagleHelmet eagleHelmet = new EagleHelmet(main);
        eagleHelmet.registerRecipe();

        FeatherHeaddress featherHeaddress = new FeatherHeaddress(main);
        featherHeaddress.registerRecipe();

        BronzeHoe bronzeHoe = new BronzeHoe(main);
        bronzeHoe.registerRecipe();

        BronzeKatar bronzeKatar = new BronzeKatar(main);
        bronzeKatar.registerRecipe();

        JaguarHelmet jaguarHelmet = new JaguarHelmet(main);
        jaguarHelmet.registerRecipe();



    }

}
