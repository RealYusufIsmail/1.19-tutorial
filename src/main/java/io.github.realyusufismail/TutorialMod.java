package io.github.realyusufismail;

import io.github.realyusufismail.core.init.BlockInit;
import io.github.realyusufismail.core.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TutorialMod.MOD_ID)
public class TutorialMod {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "tutorialmod";

    public TutorialMod() {
      IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

      ItemInit.ITEMS.register(bus);
      BlockInit.BLOCKS.register(bus);
    }
}
