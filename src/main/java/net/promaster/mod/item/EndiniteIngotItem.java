
package net.promaster.mod.item;

import net.promaster.mod.VanilishendModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@VanilishendModElements.ModElement.Tag
public class EndiniteIngotItem extends VanilishendModElements.ModElement {
	@ObjectHolder("vanilishend:endinite_ingot")
	public static final Item block = null;

	public EndiniteIngotItem(VanilishendModElements instance) {
		super(instance, 295);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("endinite_ingot");
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
