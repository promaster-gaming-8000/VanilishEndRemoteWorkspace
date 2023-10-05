// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelBloomFly extends EntityModel<Entity> {
	private final ModelRenderer BloomFly;
	private final ModelRenderer Head;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Wings;
	private final ModelRenderer LeftWing;
	private final ModelRenderer LeftWIng_r1;
	private final ModelRenderer RightWIng;
	private final ModelRenderer RightWIng_r1;
	private final ModelRenderer WholeBody;
	private final ModelRenderer MainBody;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body2;
	private final ModelRenderer Body2_r1;
	private final ModelRenderer Stringer;
	private final ModelRenderer StringerBody;
	private final ModelRenderer StringerBody1_r1;
	private final ModelRenderer SpikeStringer;
	private final ModelRenderer SpikeStringer_r1;

	public ModelBloomFly() {
		textureWidth = 64;
		textureHeight = 64;

		BloomFly = new ModelRenderer(this);
		BloomFly.setRotationPoint(0.0F, 23.0F, 0.0F);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -16.0F, 2.0F);
		BloomFly.addChild(Head);

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.1745F, 0.0F, 0.0F);
		Head_r1.setTextureOffset(0, 15).addBox(-3.0F, -2.8834F, -2.8477F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		Wings = new ModelRenderer(this);
		Wings.setRotationPoint(0.0F, -9.0F, 0.0F);
		BloomFly.addChild(Wings);

		LeftWing = new ModelRenderer(this);
		LeftWing.setRotationPoint(0.0F, 0.0F, 4.0F);
		Wings.addChild(LeftWing);

		LeftWIng_r1 = new ModelRenderer(this);
		LeftWIng_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftWing.addChild(LeftWIng_r1);
		setRotationAngle(LeftWIng_r1, 0.0698F, 0.5236F, 0.1396F);
		LeftWIng_r1.setTextureOffset(24, 15).addBox(-13.0F, -4.25F, -0.5F, 12.0F, 8.0F, 0.0F, 0.0F, false);

		RightWIng = new ModelRenderer(this);
		RightWIng.setRotationPoint(0.0F, 0.0F, 4.0F);
		Wings.addChild(RightWIng);

		RightWIng_r1 = new ModelRenderer(this);
		RightWIng_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightWIng.addChild(RightWIng_r1);
		setRotationAngle(RightWIng_r1, 0.1047F, -0.5236F, -0.1396F);
		RightWIng_r1.setTextureOffset(22, 0).addBox(0.75F, -4.2F, -0.25F, 12.0F, 8.0F, 0.0F, 0.0F, false);

		WholeBody = new ModelRenderer(this);
		WholeBody.setRotationPoint(0.0F, -7.0F, 2.0F);
		BloomFly.addChild(WholeBody);

		MainBody = new ModelRenderer(this);
		MainBody.setRotationPoint(0.0F, -3.0F, 0.0F);
		WholeBody.addChild(MainBody);

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBody.addChild(Body_r1);
		setRotationAngle(Body_r1, -0.0436F, 0.0F, 0.0F);
		Body_r1.setTextureOffset(0, 27).addBox(-2.0F, -4.0F, -1.5F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		Body2 = new ModelRenderer(this);
		Body2.setRotationPoint(0.0F, 2.0F, 0.0F);
		WholeBody.addChild(Body2);

		Body2_r1 = new ModelRenderer(this);
		Body2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body2.addChild(Body2_r1);
		setRotationAngle(Body2_r1, -0.2618F, 0.0F, 0.0F);
		Body2_r1.setTextureOffset(19, 23).addBox(-2.5F, -1.5F, -2.75F, 5.0F, 4.0F, 5.0F, 0.0F, false);

		Stringer = new ModelRenderer(this);
		Stringer.setRotationPoint(0.0F, -2.0F, 2.0F);
		BloomFly.addChild(Stringer);

		StringerBody = new ModelRenderer(this);
		StringerBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		Stringer.addChild(StringerBody);

		StringerBody1_r1 = new ModelRenderer(this);
		StringerBody1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		StringerBody.addChild(StringerBody1_r1);
		setRotationAngle(StringerBody1_r1, -0.2618F, 0.0F, 0.0F);
		StringerBody1_r1.setTextureOffset(0, 0).addBox(-3.0F, -2.2588F, -8.0341F, 6.0F, 5.0F, 10.0F, 0.0F, false);

		SpikeStringer = new ModelRenderer(this);
		SpikeStringer.setRotationPoint(0.0F, -2.0F, -8.0F);
		Stringer.addChild(SpikeStringer);

		SpikeStringer_r1 = new ModelRenderer(this);
		SpikeStringer_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		SpikeStringer.addChild(SpikeStringer_r1);
		setRotationAngle(SpikeStringer_r1, -0.8727F, 0.0F, 0.0F);
		SpikeStringer_r1.setTextureOffset(32, 8).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		BloomFly.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        this.Head_r1.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head_r1.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.RightWIng.rotateAngleY = f2 / (MathHelper.cos(f * 6F) * 1.4F * f1 +1.570796F);
			this.RightWIng_r1.rotateAngleY = f2 / (MathHelper.cos(f * 6F) * 1.4F * f1 +1.570796F);
			this.LeftWing.rotateAngleY = f2 / (MathHelper.cos(f * 6F + (float) Math.PI) * 1.4F * f1 -1.570796F);
			this.LeftWIng_r1.rotateAngleY = f2 / (MathHelper.cos(f * 6F + (float) Math.PI) * 1.4F * f1 -1.570796F);
			this.BloomFly.rotateAngleX = MathHelper.cos(f * 0.3F) * 1.2F * f1;
			this.Stringer.rotateAngleX = MathHelper.cos(f * 0.8F) * 1.2F * f1;	
	}
}