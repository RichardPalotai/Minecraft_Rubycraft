package com.ricsi.rubycraft.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.ricsi.rubycraft.entities.Giacomo;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class GiacomoModel<T extends Giacomo> extends EntityModel<T> {

    private final ModelRenderer head;
    private final ModelRenderer corehead;
    private final ModelRenderer face;
    private final ModelRenderer ears;
    private final ModelRenderer crown;
    private final ModelRenderer nose;
    private final ModelRenderer mouth;
    private final ModelRenderer mouth1;
    private final ModelRenderer mouth2;
    private final ModelRenderer front;
    private final ModelRenderer front1;
    private final ModelRenderer front2;
    private final ModelRenderer neck;
    private final ModelRenderer Body;
    private final ModelRenderer back;
    private final ModelRenderer belly;
    private final ModelRenderer croup;
    private final ModelRenderer shoulder;
    private final ModelRenderer tail;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer upperleftleg;
    private final ModelRenderer upper;
    private final ModelRenderer middle;
    private final ModelRenderer longer;
    private final ModelRenderer foot;
    private final ModelRenderer upperrightleg;
    private final ModelRenderer upper2;
    private final ModelRenderer middle2;
    private final ModelRenderer longer2;
    private final ModelRenderer foot2;
    private final ModelRenderer downleftleg;
    private final ModelRenderer upper3;
    private final ModelRenderer middle3;
    private final ModelRenderer longer3;
    private final ModelRenderer foot3;
    private final ModelRenderer downrightleg;
    private final ModelRenderer upper4;
    private final ModelRenderer middle4;
    private final ModelRenderer longer4;
    private final ModelRenderer foot4;

    public GiacomoModel() {
        textureWidth = 64;
        textureHeight = 64;

        head = new ModelRenderer(this);
        head.setRotationPoint(-0.5F, 15.0F, -5.5F);
        setRotationAngle(head, 0.0F, 0.0F, 0.0F);
        head.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        corehead = new ModelRenderer(this);
        corehead.setRotationPoint(1.5F, -1.0F, -2.5F);
        head.addChild(corehead);
        corehead.setTextureOffset(22, 9).addBox(-3.5F, -3.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

        face = new ModelRenderer(this);
        face.setRotationPoint(0.5F, -1.0F, -6.5F);
        head.addChild(face);
        setRotationAngle(face, 0.2618F, 0.0F, 0.0F);
        face.setTextureOffset(28, 30).addBox(-2.5F, -1.5164F, 1.673F, 4.0F, 3.0F, 3.0F, 0.0F, false);

        ears = new ModelRenderer(this);
        ears.setRotationPoint(-3.5F, -5.0F, -3.5F);
        head.addChild(ears);
        setRotationAngle(ears, 0.0F, 0.0F, 0.7854F);
        ears.setTextureOffset(10, 30).addBox(1.6071F, -0.0929F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        ears.setTextureOffset(12, 25).addBox(4.8071F, -3.3929F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        crown = new ModelRenderer(this);
        crown.setRotationPoint(0.5F, -5.0F, -4.5F);
        head.addChild(crown);
        setRotationAngle(crown, -0.1745F, 0.0F, 0.0F);
        crown.setTextureOffset(0, 25).addBox(-2.5F, 0.6112F, 0.3585F, 4.0F, 1.0F, 4.0F, 0.0F, false);

        nose = new ModelRenderer(this);
        nose.setRotationPoint(0.5F, -2.0F, -7.5F);
        head.addChild(nose);
        setRotationAngle(nose, 0.1745F, 0.0F, 0.0F);
        nose.setTextureOffset(0, 19).addBox(-1.0F, 0.1685F, 0.5112F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        mouth = new ModelRenderer(this);
        mouth.setRotationPoint(0.5F, 9.0F, 5.5F);
        head.addChild(mouth);


        mouth1 = new ModelRenderer(this);
        mouth1.setRotationPoint(1.0F, -11.0F, -9.0F);
        mouth.addChild(mouth1);
        setRotationAngle(mouth1, 0.1745F, 0.0F, 0.0F);
        mouth1.setTextureOffset(14, 30).addBox(-3.0F, -0.5415F, -2.1888F, 3.0F, 2.0F, 4.0F, 0.0F, false);

        mouth2 = new ModelRenderer(this);
        mouth2.setRotationPoint(0.0F, -11.0F, -13.0F);
        mouth.addChild(mouth2);
        setRotationAngle(mouth2, 0.1745F, 0.0F, 0.0F);
        mouth2.setTextureOffset(39, 29).addBox(-1.5F, 0.1585F, 0.8112F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        front = new ModelRenderer(this);
        front.setRotationPoint(0.5F, 9.0F, 5.5F);
        head.addChild(front);


        front1 = new ModelRenderer(this);
        front1.setRotationPoint(0.0F, -13.0F, -12.0F);
        front.addChild(front1);
        setRotationAngle(front1, -0.5236F, 0.0F, 0.0F);
        front1.setTextureOffset(27, 17).addBox(-2.5F, -0.634F, 1.566F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        front2 = new ModelRenderer(this);
        front2.setRotationPoint(0.0F, -14.0F, -11.0F);
        front.addChild(front2);
        setRotationAngle(front2, -0.8727F, 0.0F, 0.0F);
        front2.setTextureOffset(18, 18).addBox(-2.5F, -0.6233F, 1.4088F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        neck = new ModelRenderer(this);
        neck.setRotationPoint(1.5F, 0.0F, -0.5F);
        head.addChild(neck);
        setRotationAngle(neck, -0.5236F, 0.0F, 0.0F);
        neck.setTextureOffset(0, 30).addBox(-3.0F, -2.334F, -1.634F, 3.0F, 3.0F, 4.0F, 0.0F, false);

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 16.0F, 0.0F);
        setRotationAngle(Body, 0.0873F, 0.0F, 0.0F);

        back = new ModelRenderer(this);
        back.setRotationPoint(0.0F, 2.0F, 0.0F);
        Body.addChild(back);
        back.setTextureOffset(0, 0).addBox(-3.0F, -5.0F, -4.0F, 5.0F, 5.0F, 8.0F, 0.0F, false);

        belly = new ModelRenderer(this);
        belly.setRotationPoint(0.0F, 3.0F, -2.0F);
        Body.addChild(belly);
        setRotationAngle(belly, 0.0873F, 0.0F, 0.0F);
        belly.setTextureOffset(0, 13).addBox(-3.0F, -4.4038F, -1.0872F, 5.0F, 4.0F, 8.0F, 0.0F, false);

        croup = new ModelRenderer(this);
        croup.setRotationPoint(0.0F, -1.0F, 0.0F);
        Body.addChild(croup);
        setRotationAngle(croup, -0.2618F, 0.0F, 0.0F);
        croup.setTextureOffset(18, 0).addBox(-3.0F, -2.5341F, 2.2588F, 5.0F, 4.0F, 4.0F, 0.0F, false);

        shoulder = new ModelRenderer(this);
        shoulder.setRotationPoint(0.0F, 0.0F, -5.0F);
        Body.addChild(shoulder);
        setRotationAngle(shoulder, -0.3491F, 0.0F, 0.0F);
        shoulder.setTextureOffset(20, 20).addBox(-2.5F, -3.4023F, -0.7183F, 4.0F, 4.0F, 6.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setRotationPoint(0.0F, -5.0F, 3.0F);
        Body.addChild(tail);


        tail1 = new ModelRenderer(this);
        tail1.setRotationPoint(0.0F, 2.0F, 2.0F);
        tail.addChild(tail1);
        setRotationAngle(tail1, -0.3491F, 0.0F, 0.0F);
        tail1.setTextureOffset(18, 0).addBox(-1.0F, -1.0603F, 0.042F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        tail2 = new ModelRenderer(this);
        tail2.setRotationPoint(0.0F, 0.0F, 2.0F);
        tail.addChild(tail2);
        setRotationAngle(tail2, -0.5236F, 0.0F, 0.0F);
        tail2.setTextureOffset(18, 13).addBox(-1.0F, -0.134F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        tail3 = new ModelRenderer(this);
        tail3.setRotationPoint(0.0F, -1.0F, 2.0F);
        tail.addChild(tail3);
        setRotationAngle(tail3, -0.1745F, 0.0F, 0.0F);
        tail3.setTextureOffset(4, 6).addBox(-1.0F, 0.4848F, -0.3264F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        tail4 = new ModelRenderer(this);
        tail4.setRotationPoint(0.0F, 0.0F, 0.0F);
        tail.addChild(tail4);
        setRotationAngle(tail4, 1.2217F, 0.0F, 0.0F);
        tail4.setTextureOffset(0, 6).addBox(-1.0F, 0.642F, -0.4397F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        upperleftleg = new ModelRenderer(this);
        upperleftleg.setRotationPoint(2.0F, 16.0F, -4.0F);


        upper = new ModelRenderer(this);
        upper.setRotationPoint(-5.0F, 2.0F, -1.4F);
        upperleftleg.addChild(upper);
        setRotationAngle(upper, -0.1745F, 0.0F, 0.0F);
        upper.setTextureOffset(34, 5).addBox(4.0F, -4.0F, -0.0521F, 2.0F, 4.0F, 3.0F, 0.0F, false);

        middle = new ModelRenderer(this);
        middle.setRotationPoint(-1.8F, 12.15F, 4.9F);
        upperleftleg.addChild(middle);
        setRotationAngle(middle, 0.3491F, 0.0F, 0.0F);
        middle.setTextureOffset(31, 36).addBox(0.8F, -12.4917F, -2.0166F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        longer = new ModelRenderer(this);
        longer.setRotationPoint(5.5F, 4.0F, 8.0F);
        upperleftleg.addChild(longer);
        setRotationAngle(longer, -0.2618F, 0.0F, 0.0F);
        longer.setTextureOffset(0, 37).addBox(-6.0F, 1.0706F, -7.7274F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        foot = new ModelRenderer(this);
        foot.setRotationPoint(-2.0F, 8.0F, 4.0F);
        upperleftleg.addChild(foot);
        foot.setTextureOffset(18, 15).addBox(1.5F, -1.0F, -5.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        upperrightleg = new ModelRenderer(this);
        upperrightleg.setRotationPoint(-3.0F, 16.0F, -4.0F);


        upper2 = new ModelRenderer(this);
        upper2.setRotationPoint(0.0F, 2.0F, -1.4F);
        upperrightleg.addChild(upper2);
        setRotationAngle(upper2, -0.1745F, 0.0F, 0.0F);
        upper2.setTextureOffset(34, 17).addBox(-1.0F, -4.0F, -0.0521F, 2.0F, 4.0F, 3.0F, 0.0F, false);

        middle2 = new ModelRenderer(this);
        middle2.setRotationPoint(3.2F, 12.15F, 4.9F);
        upperrightleg.addChild(middle2);
        setRotationAngle(middle2, 0.3491F, 0.0F, 0.0F);
        middle2.setTextureOffset(36, 0).addBox(-4.2F, -12.4917F, -2.0166F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        longer2 = new ModelRenderer(this);
        longer2.setRotationPoint(5.5F, 4.0F, 8.0F);
        upperrightleg.addChild(longer2);
        setRotationAngle(longer2, -0.2618F, 0.0F, 0.0F);
        longer2.setTextureOffset(4, 37).addBox(-6.0F, 1.0706F, -7.7274F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        foot2 = new ModelRenderer(this);
        foot2.setRotationPoint(3.0F, 8.0F, 4.0F);
        upperrightleg.addChild(foot2);
        foot2.setTextureOffset(24, 30).addBox(-3.5F, -1.0F, -5.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        downleftleg = new ModelRenderer(this);
        downleftleg.setRotationPoint(2.0F, 16.0F, 4.0F);


        upper3 = new ModelRenderer(this);
        upper3.setRotationPoint(1.0F, 2.0F, -2.0F);
        downleftleg.addChild(upper3);
        setRotationAngle(upper3, -0.2618F, 0.0F, 0.0F);
        upper3.setTextureOffset(21, 36).addBox(-2.0F, -4.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, false);

        middle3 = new ModelRenderer(this);
        middle3.setRotationPoint(-2.0F, 8.25F, 2.0F);
        downleftleg.addChild(middle3);
        setRotationAngle(middle3, 0.8727F, 0.0F, 0.0F);
        middle3.setTextureOffset(0, 13).addBox(1.0F, -7.1294F, 2.483F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        longer3 = new ModelRenderer(this);
        longer3.setRotationPoint(0.5F, 4.0F, 0.0F);
        downleftleg.addChild(longer3);
        setRotationAngle(longer3, -0.2618F, 0.0F, 0.0F);
        longer3.setTextureOffset(40, 24).addBox(-1.0F, -1.0647F, 0.2415F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        foot3 = new ModelRenderer(this);
        foot3.setRotationPoint(-2.0F, 8.0F, -4.0F);
        downleftleg.addChild(foot3);
        foot3.setTextureOffset(37, 39).addBox(1.5F, -1.0F, 2.45F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        downrightleg = new ModelRenderer(this);
        downrightleg.setRotationPoint(-3.0F, 16.0F, 4.0F);


        upper4 = new ModelRenderer(this);
        upper4.setRotationPoint(6.0F, 2.0F, -2.0F);
        downrightleg.addChild(upper4);
        setRotationAngle(upper4, -0.2618F, 0.0F, 0.0F);
        upper4.setTextureOffset(11, 36).addBox(-7.0F, -4.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, false);

        middle4 = new ModelRenderer(this);
        middle4.setRotationPoint(3.0F, 8.25F, 2.0F);
        downrightleg.addChild(middle4);
        setRotationAngle(middle4, 0.8727F, 0.0F, 0.0F);
        middle4.setTextureOffset(0, 0).addBox(-4.0F, -7.1294F, 2.483F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        longer4 = new ModelRenderer(this);
        longer4.setRotationPoint(5.5F, 4.0F, 0.0F);
        downrightleg.addChild(longer4);
        setRotationAngle(longer4, -0.2618F, 0.0F, 0.0F);
        longer4.setTextureOffset(38, 12).addBox(-6.0F, -1.0647F, 0.2415F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        foot4 = new ModelRenderer(this);
        foot4.setRotationPoint(3.0F, 8.0F, -4.0F);
        downrightleg.addChild(foot4);
        foot4.setTextureOffset(18, 36).addBox(-3.5F, -1.0F, 2.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.downrightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.downleftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.upperrightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.upperleftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
        upperleftleg.render(matrixStack, buffer, packedLight, packedOverlay);
        upperrightleg.render(matrixStack, buffer, packedLight, packedOverlay);
        downleftleg.render(matrixStack, buffer, packedLight, packedOverlay);
        downrightleg.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
