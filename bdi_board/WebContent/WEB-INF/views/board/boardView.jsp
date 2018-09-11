<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:if test="${cnt eq 1}">
	<script>
		alert("게시물이 정상적으로 등록 되었습니다.");
		location.href="/board/boardList";
	</script>
</c:if>
<body>
        <article class="container">
            <div class="page-header">
                <div class="col-md-6 col-md-offset-3">
                <h3>게시글 작성</h3>
                </div>
            </div>
            <div class="col-sm-6 col-md-offset-3">
                <form method="post" action="/board/boardInsert" enctype="multipart/form-data">
					<div class="form-group"> <!-- Name field -->
						<label class="control-label " for="uiname">등록자</label>
						<input class="form-control" id="uiname" name="uiname" type="text" value="${user.uiname}" disabled/>
					</div>
					<div class="form-group"> <!-- Subject field -->
						<label class="control-label " for="bititle">제목</label>
						<input class="form-control" id="bititle" name="bititle" value="${bi.bititle}" type="text"disabled/>
					</div>
					
					<div class="form-group"> <!-- Message field -->
						<label class="control-label " for="bitext">내용</label>
						<textarea class="form-control" cols="40" id="bitext" name="bitext" rows="10" disabled>${bi.bitext}</textarea>
					</div>
					<div class="form-group"> <!-- Message field -->
						<label class="control-label " for="bifile">파일</label>
						<input class="form-control" id="bifile" name="bifile" type="file">
						<img src="">
					</div>
					<div class="form-group">
						<button class="btn" data-page="/board/boardList">리스트로 돌아가기</button>
					</div>
					<input type="hidden" name="uinum" value="${user.uinum}">
				</form>								
            </div>
        </article>