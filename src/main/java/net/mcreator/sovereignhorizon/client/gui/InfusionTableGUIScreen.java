package net.mcreator.sovereignhorizon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.sovereignhorizon.world.inventory.InfusionTableGUIMenu;
import net.mcreator.sovereignhorizon.network.InfusionTableGUIButtonMessage;
import net.mcreator.sovereignhorizon.SovereignHorizonMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class InfusionTableGUIScreen extends AbstractContainerScreen<InfusionTableGUIMenu> {
	private final static HashMap<String, Object> guistate = InfusionTableGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_infuse;

	public InfusionTableGUIScreen(InfusionTableGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 172;
		this.imageHeight = 149;
	}

	private static final ResourceLocation texture = new ResourceLocation("sovereign_horizon:textures/screens/infusion_table_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("sovereign_horizon:textures/screens/icon_potion.png"), this.leftPos + 59, this.topPos + 39, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("sovereign_horizon:textures/screens/arrow_active.png"), this.leftPos + 94, this.topPos + 16, 0, 0, 22, 15, 22, 15);

		guiGraphics.blit(new ResourceLocation("sovereign_horizon:textures/screens/icon_armor.png"), this.leftPos + 23, this.topPos + 37, 0, 0, 14, 19, 14, 19);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.sovereign_horizon.infusion_table_gui.label_infusion_table"), 6, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_infuse = Button.builder(Component.translatable("gui.sovereign_horizon.infusion_table_gui.button_infuse"), e -> {
			if (true) {
				SovereignHorizonMod.PACKET_HANDLER.sendToServer(new InfusionTableGUIButtonMessage(0, x, y, z));
				InfusionTableGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 121, this.topPos + 39, 36, 20).build();
		guistate.put("button:button_infuse", button_infuse);
		this.addRenderableWidget(button_infuse);
	}
}
