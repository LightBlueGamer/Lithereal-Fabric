package net.raylightstudios.lithereal.common.blocks.crusher;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CrusherBlockEntity extends BaseContainerBlockEntity{
    public CrusherBlockEntity( BlockEntityType <?> pType , BlockPos pWorldPosition , BlockState pBlockState ){
        super( pType , pWorldPosition , pBlockState );
    }

    @Override
    protected Component getDefaultName(){
        return null;
    }

    @Override
    protected AbstractContainerMenu createMenu( int pContainerId , Inventory pInventory ){
        return null;
    }

    @Override
    public int getContainerSize(){
        return 0;
    }

    @Override
    public boolean isEmpty(){
        return false;
    }

    @Override
    public ItemStack getItem( int pIndex ){
        return null;
    }

    @Override
    public ItemStack removeItem( int pIndex , int pCount ){
        return null;
    }

    @Override
    public ItemStack removeItemNoUpdate( int pIndex ){
        return null;
    }

    @Override
    public void setItem( int pIndex , ItemStack pStack ){

    }

    @Override
    public boolean stillValid( Player pPlayer ){
        return false;
    }

    @Override
    public void clearContent(){

    }
}
