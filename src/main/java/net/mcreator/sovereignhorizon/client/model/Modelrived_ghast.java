package net.mcreator.sovereignhorizon.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class Modelrived_ghast<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("sovereign_horizon", "modelrived_ghast"), "main");
	public final ModelPart body;
	public final ModelPart leftbody;
	public final ModelPart righthalf;
	public final ModelPart tentacles_0;
	public final ModelPart tentacles_1;
	public final ModelPart tentacles_2;
	public final ModelPart tentacles_3;
	public final ModelPart tentacles_4;
	public final ModelPart tentacles_5;
	public final ModelPart tentacles_6;
	public final ModelPart tentacles_7;

	public Modelrived_ghast(ModelPart root) {
		this.body = root.getChild("body");
		this.leftbody = this.body.getChild("leftbody");
		this.righthalf = this.body.getChild("righthalf");
		this.tentacles_0 = this.body.getChild("tentacles_0");
		this.tentacles_1 = this.body.getChild("tentacles_1");
		this.tentacles_2 = this.body.getChild("tentacles_2");
		this.tentacles_3 = this.body.getChild("tentacles_3");
		this.tentacles_4 = this.body.getChild("tentacles_4");
		this.tentacles_5 = this.body.getChild("tentacles_5");
		this.tentacles_6 = this.body.getChild("tentacles_6");
		this.tentacles_7 = this.body.getChild("tentacles_7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, 5.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, -5.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition leftbody = body.addOrReplaceChild("leftbody", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -16.0F, -8.0F, 5.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
				.addBox(-3.0F, -11.0F, -8.0F, 2.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 64).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition righthalf = body.addOrReplaceChild("righthalf",
				CubeListBuilder.create().texOffs(0, 32).addBox(4.0F, -16.0F, -8.0F, 4.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(40, 32).addBox(2.0F, -16.0F, -6.0F, 2.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(40, 58)
						.addBox(0.0F, -16.0F, -4.0F, 2.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(68, 58).addBox(-1.0F, -13.0F, -3.0F, 1.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition tentacles_0 = body.addOrReplaceChild("tentacles_0", CubeListBuilder.create().texOffs(72, 27).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.8F, 7.0F, -5.0F));
		PartDefinition tentacles_1 = body.addOrReplaceChild("tentacles_1", CubeListBuilder.create().texOffs(72, 14).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.3F, 7.0F, -5.0F));
		PartDefinition tentacles_2 = body.addOrReplaceChild("tentacles_2", CubeListBuilder.create().texOffs(72, 38).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(6.3F, 7.0F, -5.0F));
		PartDefinition tentacles_3 = body.addOrReplaceChild("tentacles_3", CubeListBuilder.create().texOffs(72, 27).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.3F, 7.0F, 0.0F));
		PartDefinition tentacles_4 = body.addOrReplaceChild("tentacles_4", CubeListBuilder.create().texOffs(26, 64).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3F, 7.0F, 0.0F));
		PartDefinition tentacles_5 = body.addOrReplaceChild("tentacles_5", CubeListBuilder.create().texOffs(72, 14).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.8F, 7.0F, 0.0F));
		PartDefinition tentacles_6 = body.addOrReplaceChild("tentacles_6", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.8F, 7.0F, 5.0F));
		PartDefinition tentacles_7 = body.addOrReplaceChild("tentacles_7", CubeListBuilder.create().texOffs(26, 64).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(6.3F, 7.0F, 5.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.tentacles_6.xRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.tentacles_7.xRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.tentacles_0.xRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.tentacles_1.xRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.tentacles_2.xRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.tentacles_3.xRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.tentacles_4.xRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.tentacles_5.xRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
	}
}
