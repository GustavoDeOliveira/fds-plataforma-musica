# 
# makefile para a compila��o do documento
#

BASE_NAME = projeto-exemplo

PDFLATEX  = pdflatex
BIBTEX    = bibtex
MAKEINDEX = makeindex

pdf: clean $(BASE_NAME).pdf

$(BASE_NAME).pdf: $(BASE_NAME).tex 
	$(PDFLATEX) $<
	$(BIBTEX) $(BASE_NAME) 
	$(MAKEINDEX) $(BASE_NAME) 
	$(PDFLATEX) $< 
	$(PDFLATEX) $<


clean:
	rm -f $(BASE_NAME)*.ps $(BASE_NAME)*.dvi *.log \
	*.aux *.blg *.toc \
	missfont.log $(BASE_NAME)*.bbl $(BASE_NAME).pdf $(BASE_NAME)*.out \
	$(BASE_NAME)*.lof $(BASE_NAME)*.lot 
	
