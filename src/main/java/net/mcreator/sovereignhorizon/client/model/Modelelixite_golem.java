package net.mcreator.sovereignhorizon.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelelixite_golem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sovereign_horizon", "modelelixite_golem"), "main");
	public final ModelPart head;
	public final ModelPart SpinLayer1;
	public final ModelPart SpinLayer2;
	public final ModelPart SpinLayer3;
	public final ModelPart SpinLayer4;

	public Modelelixite_golem(ModelPart root) {
		this.head = root.getChild("head");
		this.SpinLayer1 = root.getChild("SpinLayer1");
		this.SpinLayer2 = root.getChild("SpinLayer2");
		this.SpinLayer3 = root.getChild("SpinLayer3");
		this.SpinLayer4 = root.getChild("SpinLayer4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -16.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 28.0F, 0.0F));
		PartDefinition SpinLayer1 = partdefinition.addOrReplaceChild("SpinLayer1",
				CubeListBuilder.create().texOffs(28, 14).addBox(-2.0F, -1.0F, -7.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 20).addBox(-2.0F, -1.0F, 4.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(4.0F, -1.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 12).addBox(-8.0F, -1.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition SpinLayer2 = partdefinition.addOrReplaceChild("SpinLayer2",
				CubeListBuilder.create().texOffs(28, 26).addBox(-2.0F, -1.0F, -7.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 32).addBox(-2.0F, -1.0F, 4.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(4.0F, -1.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 19).addBox(-8.0F, -1.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition SpinLayer3 = partdefinition.addOrReplaceChild("SpinLayer3",
				CubeListBuilder.create().texOffs(0, 33).addBox(-2.0F, -1.0F, -7.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 33).addBox(-2.0F, -1.0F, 4.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(4.0F, -1.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-8.0F, -1.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.0F, 0.0F));
		PartDefinition SpinLayer4 = partdefinition.addOrReplaceChild("SpinLayer4",
				CubeListBuilder.create().texOffs(38, 0).addBox(-2.0F, -1.0F, -7.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 38).addBox(-2.0F, -1.0F, 4.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 26)
						.addBox(4.0F, -1.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 7).addBox(-8.0F, -1.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 22.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		SpinLayer1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		SpinLayer2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		SpinLayer3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		SpinLayer4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
