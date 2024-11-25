package net.fishstack.fishsgadgets.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties FISH_INGOT = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 200), 1.0f).build();
    public static final FoodProperties BANANENE = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f).build();

    public static final FoodProperties RAW_SHRIMP = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build();
    public static final FoodProperties COOKED_SHRIMP = new FoodProperties.Builder().nutrition(5).saturationMod(0.7f).build();
    public static final FoodProperties SHRIMP_SUSHI = new FoodProperties.Builder().nutrition(7).saturationMod(0.6f).build();
    public static final FoodProperties SHRIMP_SOUP = stew(7).build();

    private static FoodProperties.Builder stew(int pNutrition) {
        return (new FoodProperties.Builder()).nutrition(pNutrition).saturationMod(0.6F);
    }
}
