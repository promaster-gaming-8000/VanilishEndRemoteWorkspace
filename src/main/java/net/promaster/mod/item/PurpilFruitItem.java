
package net.promaster.mod.item;

import net.promaster.mod.VanilishendModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.block.BlockState;

@VanilishendModElements.ModElement.Tag
public class PurpilFruitItem extends VanilishendModElements.ModElement {
	@ObjectHolder("vanilishend:purpil_fruit")
	public static final Item block = null;

	public PurpilFruitItem(VanilishendModElements instance) {
		super(instance, 201);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON).food((new Food.Builder()).hunger(4).saturation(0.3f)

					.build()));
			setRegistryName("purpil_fruit");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0F;
		}
	}
}
