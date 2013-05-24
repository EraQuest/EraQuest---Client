package net.minecraft.src;

import java.util.List;
import java.util.Random;

import net.minecraft.src.BlockBreakable;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Icon;
import net.minecraft.src.IconRegister;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class BlockColorGlass extends BlockBreakable{

        protected BlockColorGlass(int par1) {
                super(par1, "glass", Material.glass, false);
        }

        private Icon[] icons = new Icon[6];
        public static String[] iconText = new String[6];
        
        
        
        public int getRenderBlockPass()
    {
        return 1;
    }
        
        public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    protected boolean canSilkHarvest()
    {
        return true;
    }
    
    public int damageDropped(int par1)
    {
        return par1;
    }
    
    public Icon getIcon(int par1, int par2)
    {
        return this.icons[par2];
    }
    
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for(int var4 = 0; var4 < icons.length; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
    
    public void registerIcons(IconRegister par1IconRegister)
    {
        for(int i = 0; i < icons.length; i++)
        {
                icons[i] = par1IconRegister.registerIcon("colorGlass_" + i);
        }
    }
}