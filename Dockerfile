FROM alpine:3.12

LABEL maintainer "nishipy"

EXPOSE 8000

RUN apk update \
  && apk add --no-cache gcc libc-dev python3 py3-pip python3-dev \
  && pip3 install --upgrade pip \
  && pip3 install mkdocs mkdocs-material

WORKDIR /workdir
COPY mkdocsdir/ /workdir/

ENTRYPOINT ["/bin/sh", "-c", "mkdocs serve"]
