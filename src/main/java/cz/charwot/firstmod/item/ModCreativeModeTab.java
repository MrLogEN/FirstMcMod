package cz.charwot.firstmod.item;

import cz.charwot.firstmod.FirstMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_FIRST_MOD_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> FIRST_MOD_TAB = CREATIVE_MODE_FIRST_MOD_TABS
            .register("firstmodtab", ()->CreativeModeTab.builder()
                    .icon(()->ModItems.ZIRCON.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.ZIRCON.get());
                        output.accept(ModItems.RAW_ZIRCON.get());
                        output.accept(ModItems.ZIRCON_BLOCK.get());
                        output.accept(ModItems.ZIRCON_ORE.get());
                        output.accept(ModItems.EIGHT_BALL.get());
                        output.accept(ModItems.JUMPY_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus){

        CREATIVE_MODE_FIRST_MOD_TABS.register(eventBus);
    }
}
