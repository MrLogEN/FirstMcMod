package cz.charwot.firstmod.item;

import cz.charwot.firstmod.FirstMod;
import cz.charwot.firstmod.block.ModBlocks;
import cz.charwot.firstmod.item.custom.EightBallItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            ()-> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            ()-> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            ()-> new EightBallItem(new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> ZIRCON_BLOCK = ITEMS.register("zircon_block",
            ()-> new BlockItem(ModBlocks.ZIRCON_BLOCK.get(), new Item.Properties())
    );
    public static final RegistryObject<Item> ZIRCON_ORE = ITEMS.register("zircon_ore",
            ()-> new BlockItem(ModBlocks.ZIRCON_ORE.get(),new Item.Properties()));
    public static final RegistryObject<Item> JUMPY_BLOCK = ITEMS.register("jumpy_block",
            ()-> new BlockItem(ModBlocks.JUMPY_BLOCK.get(),new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
