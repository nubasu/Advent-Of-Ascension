package net.tslat.aoa3.client.model.entities.tablets;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPressureTablet extends ModelBase {
	private final ModelRenderer base;
	private final ModelRenderer icon;

	public ModelPressureTablet() {
		textureWidth = 32;
		textureHeight = 32;

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 24.0F, 0.0F);
		base.cubeList.add(new ModelBox(base, 0, 0, -4.0F, -1.05F, -4.0F, 8, 1, 5, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 26, -4.0F, -1.04F, -4.0F, 8, 1, 5, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 9, 0, -3.5F, -1.05F, 1.0F, 7, 1, 4, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 1, 27, -3.5F, -1.04F, 1.0F, 7, 1, 4, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 8, -4.5F, -1.0F, -4.5F, 9, 1, 1, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 6, -0.2844F, -1.0F, 4.4658F, 4, 1, 1, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 6, -3.7156F, -1.0F, 4.4658F, 4, 1, 1, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 6, -3.7156F, -1.25F, 4.4658F, 4, 1, 1, 0.0F, true));
		base.cubeList.add(new ModelBox(base, 10, 6, -0.2844F, -1.25F, 4.4658F, 4, 1, 1, 0.0F, true));
		base.cubeList.add(new ModelBox(base, 0, 8, -4.5F, -1.25F, -4.5F, 9, 1, 1, 0.0F, false));

		ModelRenderer cube2 = new ModelRenderer(this);
		cube2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(cube2, 0.0F, 1.4835F, 0.0F);
		base.addChild(cube2);
		cube2.cubeList.add(new ModelBox(cube2, 0, 8, -5.1211F, -1.0F, 3.1778F, 9, 1, 1, 0.0F, false));
		cube2.cubeList.add(new ModelBox(cube2, 0, 8, -5.1211F, -1.25F, 3.1778F, 9, 1, 1, 0.0F, false));

		ModelRenderer cube3 = new ModelRenderer(this);
		cube3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(cube3, 0.0F, -1.4835F, 0.0F);
		base.addChild(cube3);
		cube3.cubeList.add(new ModelBox(cube3, 0, 6, -3.8789F, -1.0F, 3.1778F, 9, 1, 1, 0.0F, false));
		cube3.cubeList.add(new ModelBox(cube3, 0, 6, -3.8789F, -1.25F, 3.1778F, 9, 1, 1, 0.0F, false));

		icon = new ModelRenderer(this);
		icon.setRotationPoint(0.0F, 24.0F, 1.25F);
		icon.cubeList.add(new ModelBox(icon, 7, 10, 0.0F, -1.25F, -0.75F, 2, 1, 2, 0.0F, false));
		icon.cubeList.add(new ModelBox(icon, 0, 10, 0.6464F, -1.251F, 0.6036F, 1, 1, 1, 0.0F, false));
		icon.cubeList.add(new ModelBox(icon, 15, 11, 0.6464F, -1.249F, -1.1036F, 1, 1, 1, 0.0F, false));
		icon.cubeList.add(new ModelBox(icon, 0, 10, -0.3536F, -1.251F, -0.3964F, 1, 1, 1, 0.0F, false));
		icon.cubeList.add(new ModelBox(icon, 15, 11, 1.3536F, -1.249F, -0.3964F, 1, 1, 1, 0.0F, false));
		icon.cubeList.add(new ModelBox(icon, 0, 10, -0.3536F, -1.251F, -0.1036F, 1, 1, 1, 0.0F, false));
		icon.cubeList.add(new ModelBox(icon, 15, 11, 1.3536F, -1.249F, -0.1036F, 1, 1, 1, 0.0F, false));
		icon.cubeList.add(new ModelBox(icon, 0, 10, 0.3536F, -1.251F, 0.6036F, 1, 1, 1, 0.0F, false));
		icon.cubeList.add(new ModelBox(icon, 15, 11, 0.3536F, -1.249F, -1.1036F, 1, 1, 1, 0.0F, false));
		icon.cubeList.add(new ModelBox(icon, 0, 12, -0.2464F, -1.25F, -0.9536F, 1, 1, 1, 0.0F, false));
		icon.cubeList.add(new ModelBox(icon, 15, 11, -1.0F, -1.249F, -1.7036F, 1, 1, 1, 0.0F, false));
		icon.cubeList.add(new ModelBox(icon, 0, 10, -1.1393F, -1.251F, -2.9571F, 2, 1, 1, 0.0F, false));
		icon.cubeList.add(new ModelBox(icon, 15, 11, -2.5964F, -1.249F, -2.3536F, 1, 1, 1, 0.0F, false));

		ModelRenderer cube = new ModelRenderer(this);
		cube.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(cube, 0.0F, -0.7854F, 0.0F);
		icon.addChild(cube);
		cube.cubeList.add(new ModelBox(cube, 4, 14, 0.3839F, -1.2511F, -0.1161F, 1, 1, 1, 0.0F, false));
		cube.cubeList.add(new ModelBox(cube, 1, 12, -2.3521F, -1.25F, -0.2929F, 1, 1, 1, 0.0F, false));
		cube.cubeList.add(new ModelBox(cube, 1, 12, -3.5431F, -1.25F, -1.2854F, 1, 1, 1, 0.0F, false));
		cube.cubeList.add(new ModelBox(cube, 15, 11, -2.7931F, -1.25F, -2.2854F, 1, 1, 1, 0.0F, false));
		cube.cubeList.add(new ModelBox(cube, 1, 12, 1.2981F, -1.25F, -1.0303F, 1, 1, 1, 0.0F, false));
		cube.cubeList.add(new ModelBox(cube, 15, 11, 0.3839F, -1.249F, -1.9445F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		base.render(f5);
		icon.render(f5);
	}

	private void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
