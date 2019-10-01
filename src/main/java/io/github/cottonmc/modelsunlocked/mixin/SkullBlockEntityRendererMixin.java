package io.github.cottonmc.modelsunlocked.mixin;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.entity.SkullBlockEntity;
import net.minecraft.client.render.block.entity.SkullBlockEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SkullBlockEntityRenderer.class)
public class SkullBlockEntityRendererMixin {
    @Inject(method = "method_3577", at = @At("HEAD"), cancellable = true)
    private void onMethod_3577(SkullBlockEntity skull, double x, double y, double z, float delta, int int_1, CallbackInfo info) {
        if (skull.getCachedState().getRenderType() == BlockRenderType.MODEL) {
            info.cancel();
        }
    }
}
