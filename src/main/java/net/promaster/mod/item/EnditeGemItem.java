
package net.promaster.mod.item;

import net.promaster.mod.VanilishendModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@VanilishendModElements.ModElement.Tag
public class EnditeGemItem extends VanilishendModElements.ModElement {
	@ObjectHolder("vanilishend:endite_gem")
	public static final Item block = null;

	public EnditeGemItem(VanilishendModElements instance) {
		super(instance, 291);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("endite_gem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
