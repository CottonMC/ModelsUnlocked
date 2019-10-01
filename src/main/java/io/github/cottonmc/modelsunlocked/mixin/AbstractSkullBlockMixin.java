package io.github.cottonmc.modelsunlocked.mixin;

import net.minecraft.block.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(AbstractSkullBlock.class)
public abstract class AbstractSkullBlockMixin extends BlockWithEntity {
    @Shadow
    public abstract SkullBlock.SkullType getSkullType();

    private AbstractSkullBlockMixin(Settings settings) {
        super(settings);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        SkullBlock.SkullType type = getSkullType();
        return type == SkullBlock.Type.PLAYER || type == SkullBlock.Type.DRAGON ? super.getRenderType(state) : BlockRenderType.MODEL;
    }
}
