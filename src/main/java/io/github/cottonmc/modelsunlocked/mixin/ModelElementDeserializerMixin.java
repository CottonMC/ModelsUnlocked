package io.github.cottonmc.modelsunlocked.mixin;

import com.google.gson.JsonObject;
import net.minecraft.client.render.model.json.ModelElement;
import net.minecraft.util.JsonHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ModelElement.Deserializer.class)
public class ModelElementDeserializerMixin {
    @Inject(method = "deserializeRotationAngle", at = @At("HEAD"), cancellable = true)
    private void onDeserializeRotationAngle(JsonObject json, CallbackInfoReturnable<Float> info) {
        info.setReturnValue(JsonHelper.getFloat(json, "angle"));
    }
}
