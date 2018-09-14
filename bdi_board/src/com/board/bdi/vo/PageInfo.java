package com.board.bdi.vo;

public class PageInfo {
	private Integer page = 1;		
	private Integer rowCnt = 10;	// 1 페이지에 보여질 게시물 수
	private Integer blockCnt = 10;	// 1 페이지에 보여질 블락 수
	private Integer totalCnt;		// 총 게시물 수
	private Integer limitFNum = 0;	// 현재 보여질 게시물 시작
	private Integer limitLNum = 10;	// 현재 보여질 게시물 시작부터 보여질 게시물 수

	private Integer totalPage; 		// 총 페이지 수
	private Integer totalBlock;		// 총 블락 수
	private Integer sBlock;			// 시작 블락
	private Integer eBlock;			// 끝 블락
	
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRowCnt() {
		return rowCnt;
	}

	public void setRowCnt(Integer rowCnt) {
		this.rowCnt = rowCnt;
	}

	public Integer getBlockCnt() {
		return blockCnt;
	}

	public void setBlockCnt(Integer blockCnt) {
		this.blockCnt = blockCnt;
	}

	public Integer getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(Integer totalCnt) {
		this.totalCnt = totalCnt;
	}

	public Integer getLimitFNum() {
		return limitFNum;
	}

	public void setLimitFNum(Integer limitFNum) {
		this.limitFNum = limitFNum;
	}

	public Integer getLimitLNum() {
		return limitLNum;
	}

	public void setLimitLNum(Integer limitLNum) {
		this.limitLNum = limitLNum;
	}
	
	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalBlock() {
		return totalBlock;
	}

	public void setTotalBlock(Integer totalBlock) {
		this.totalBlock = totalBlock;
	}

	public Integer getsBlock() {
		return sBlock;
	}

	public void setsBlock(Integer sBlock) {
		this.sBlock = sBlock;
	}

	public Integer geteBlock() {
		return eBlock;
	}

	public void seteBlock(Integer eBlock) {
		this.eBlock = eBlock;
	}

	public void pageCount() {
		if(totalCnt==null) {
			//TODO 에러처리필요
		}
		// 게시물이 1003개이면
		// totalPage = 101
		// totalblock = 10
		// 현재 page가 101이면
		// limitFnum = 1000 //1000번째 게시물부터보임
		// sBlock = 101
		// eBlock = 110
		// if(eBlock>totalPage) { 	// (110>101)
		//	eBlock = totalPage; 	// eBlock = 101	
		//}
		totalPage = (int)(Math.ceil((double)totalCnt/rowCnt)); // 총 페이지 수 
		totalBlock = (int)(Math.ceil((double)totalPage/blockCnt)); // 총 블락 수
		limitFNum = (page-1) * rowCnt;
		sBlock = ((int)(Math.ceil((double)page/blockCnt))-1) * 10 +1; // 블락 시작
		eBlock = sBlock + blockCnt-1; // 블락 끝
		if(eBlock>totalPage) { // 끝 블락이 총 페이지 수 보다 크면
			eBlock = totalPage;
		}
	}
}
