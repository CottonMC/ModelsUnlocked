package io.github.cottonmc.modelsunlocked.mixin;

import net.minecraft.block.entity.BedBlockEntity;
import net.minecraft.client.render.block.entity.BedBlockEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BedBlockEntityRenderer.class)
public class BedBlockEntityRendererMixin {
    @Inject(method = "method_3557", at = @At("HEAD"), cancellable = true)
    private void onRender(BedBlockEntity bed, double x, double y, double z, float delta, int int_1, CallbackInfo info) {
        info.cancel();
    }
}
