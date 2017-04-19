package com.gz.hkjs.app.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/4/14.
 */

public class TrainVedioDetail {

    /**
     * ret : 200
     * msg :
     * data : {"id":"13","name":"腹部入门","logo_url":"http://alipic.cnys.com/upload9/image/2017-04-11/BZGBN8YbhB.png","exaggerate":"19","wtime":"8","apparatus":"9","proposal":"每天训练1次，汗水不会白流","suitable":"a、适合平时缺少运动的训练者 b、腹部力量薄弱的初学者","attention":"a、训练前进行热身训练，减少运动伤害 b、训练后进行对应部位的拉伸可以有效缓解疼痛 c、训练中采用正确的呼吸方式 d、感受腹部肌肉的募集感，建立肌肉记忆","energy":"50","step":[{"px_num":"1","num":"1","num_time":"","frequency":"8","video_name":"跪卧收腹","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/kexk4xadMd.mp4","video_time":"","video_num":"","logo_url":"http://alipic.cnys.com/upload9/image/2017-04-11/np74byxiMP.png"},{"px_num":"2","num":"2","num_time":"","frequency":"8","video_name":"坐姿后弯腰","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/XCrtpDSCRZ.mp4","video_time":"","video_num":"","logo_url":"http://alipic.cnys.com/upload9/image/2017-04-11/23SmZx8sFd.png"},{"px_num":"4","num":"2","num_time":"","frequency":"10","video_name":"摸膝卷腹","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/2JBYQ7naaM.mp4","video_time":"","video_num":"","logo_url":"http://alipic.cnys.com/upload9/image/2017-04-11/WXyYXfpHfB.png"},{"px_num":"5","num":"1","num_time":"03:30","frequency":"","video_name":"腹部拉伸","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/ir45N2DfZ8.mp4","video_time":"","video_num":"","logo_url":"http://alipic.cnys.com/upload9/image/2017-04-11/x5xnbiCKbj.png"}],"video_list":[{"num_time":"","num":"","end_time":"0:14.50","start_time":"0:00.00","video_name":"跪卧收腹","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/kexk4xadMd.mp4","video_time":"","video_num":""},{"num_time":"","num":"","end_time":"1:43.50","start_time":"0:14.60","video_name":"跪卧收腹","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/kexk4xadMd.mp4","video_time":"","video_num":""},{"num_time":"","num":"","end_time":"2:06.40","start_time":"1:43.50","video_name":"坐姿后弯腰","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/XCrtpDSCRZ.mp4","video_time":"","video_num":""},{"num_time":"","num":"","end_time":"3:37.20","start_time":"2:06.40","video_name":"坐姿后弯腰","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/XCrtpDSCRZ.mp4","video_time":"","video_num":""},{"num_time":"","num":"","end_time":"4:07.20","start_time":"3:37.20","video_name":"休息-1","video_url":"http://alipic.cnys.com/upload9/video/2017-04-12/t43HJ3pc85.mp4","video_time":"","video_num":""}],"audio_list":[{"end_time":"","start_time":"0:00.00","audio_name":"旁白-跪卧收腹","audio_url":"http://alipic.cnys.com/upload9/video/2017-04-13/Xy27aEPEBD.m4a","audio_time":"","audio_num":"16964"},{"end_time":"","start_time":"0:02.00","audio_name":"旁白-每组8次","audio_url":"http://alipic.cnys.com/upload9/video/2017-04-13/PwjSZX4BXJ.m4a","audio_time":"","audio_num":"37340"},{"end_time":"","start_time":"0:04.00","audio_name":"讲解-跪卧收腹","audio_url":"http://alipic.cnys.com/upload9/video/2017-04-13/iBbJf4GHyA.m4a","audio_time":"","audio_num":""},{"end_time":"","start_time":"0:14.60","audio_name":"要点-跪卧收腹","audio_url":"http://alipic.cnys.com/upload9/video/2017-04-13/BXizCANCpj.m4a","audio_time":"","audio_num":"171408"},{"end_time":"","start_time":"3:37.20","audio_name":"旁白-休息一下","audio_url":"http://alipic.cnys.com/upload9/video/2017-04-13/RpsJpBeSH7.m4a","audio_time":"","audio_num":"36802"}],"element_list":[{"num_time":"","num":"","end_time":"0:14.50","start_time":"0:00.00","element":"","dsc":"跪卧收腹 8次"},{"num_time":"","num":"8","end_time":"1:43.50","start_time":"0:14.60","element":"4","dsc":""},{"num_time":"","num":"","end_time":"2:06.40","start_time":"1:43.50","element":"","dsc":"坐姿后弯腰 2×8次"},{"num_time":"","num":"8","end_time":"3:37.20","start_time":"2:06.40","element":"4","dsc":""},{"num_time":"30","num":"","end_time":"4:07.20","start_time":"3:37.20","element":"5","dsc":"下一组：摸膝卷腹 2×10次"}]}
     */

    private String ret;
    private String msg;
    private DataBean data;

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 13
         * name : 腹部入门
         * logo_url : http://alipic.cnys.com/upload9/image/2017-04-11/BZGBN8YbhB.png
         * exaggerate : 19
         * wtime : 8
         * apparatus : 9
         * proposal : 每天训练1次，汗水不会白流
         * suitable : a、适合平时缺少运动的训练者 b、腹部力量薄弱的初学者
         * attention : a、训练前进行热身训练，减少运动伤害 b、训练后进行对应部位的拉伸可以有效缓解疼痛 c、训练中采用正确的呼吸方式 d、感受腹部肌肉的募集感，建立肌肉记忆
         * energy : 50
         * step : [{"px_num":"1","num":"1","num_time":"","frequency":"8","video_name":"跪卧收腹","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/kexk4xadMd.mp4","video_time":"","video_num":"","logo_url":"http://alipic.cnys.com/upload9/image/2017-04-11/np74byxiMP.png"},{"px_num":"2","num":"2","num_time":"","frequency":"8","video_name":"坐姿后弯腰","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/XCrtpDSCRZ.mp4","video_time":"","video_num":"","logo_url":"http://alipic.cnys.com/upload9/image/2017-04-11/23SmZx8sFd.png"},{"px_num":"4","num":"2","num_time":"","frequency":"10","video_name":"摸膝卷腹","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/2JBYQ7naaM.mp4","video_time":"","video_num":"","logo_url":"http://alipic.cnys.com/upload9/image/2017-04-11/WXyYXfpHfB.png"},{"px_num":"5","num":"1","num_time":"03:30","frequency":"","video_name":"腹部拉伸","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/ir45N2DfZ8.mp4","video_time":"","video_num":"","logo_url":"http://alipic.cnys.com/upload9/image/2017-04-11/x5xnbiCKbj.png"}]
         * video_list : [{"num_time":"","num":"","end_time":"0:14.50","start_time":"0:00.00","video_name":"跪卧收腹","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/kexk4xadMd.mp4","video_time":"","video_num":""},{"num_time":"","num":"","end_time":"1:43.50","start_time":"0:14.60","video_name":"跪卧收腹","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/kexk4xadMd.mp4","video_time":"","video_num":""},{"num_time":"","num":"","end_time":"2:06.40","start_time":"1:43.50","video_name":"坐姿后弯腰","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/XCrtpDSCRZ.mp4","video_time":"","video_num":""},{"num_time":"","num":"","end_time":"3:37.20","start_time":"2:06.40","video_name":"坐姿后弯腰","video_url":"http://alipic.cnys.com/upload9/video/2017-04-11/XCrtpDSCRZ.mp4","video_time":"","video_num":""},{"num_time":"","num":"","end_time":"4:07.20","start_time":"3:37.20","video_name":"休息-1","video_url":"http://alipic.cnys.com/upload9/video/2017-04-12/t43HJ3pc85.mp4","video_time":"","video_num":""}]
         * audio_list : [{"end_time":"","start_time":"0:00.00","audio_name":"旁白-跪卧收腹","audio_url":"http://alipic.cnys.com/upload9/video/2017-04-13/Xy27aEPEBD.m4a","audio_time":"","audio_num":"16964"},{"end_time":"","start_time":"0:02.00","audio_name":"旁白-每组8次","audio_url":"http://alipic.cnys.com/upload9/video/2017-04-13/PwjSZX4BXJ.m4a","audio_time":"","audio_num":"37340"},{"end_time":"","start_time":"0:04.00","audio_name":"讲解-跪卧收腹","audio_url":"http://alipic.cnys.com/upload9/video/2017-04-13/iBbJf4GHyA.m4a","audio_time":"","audio_num":""},{"end_time":"","start_time":"0:14.60","audio_name":"要点-跪卧收腹","audio_url":"http://alipic.cnys.com/upload9/video/2017-04-13/BXizCANCpj.m4a","audio_time":"","audio_num":"171408"},{"end_time":"","start_time":"3:37.20","audio_name":"旁白-休息一下","audio_url":"http://alipic.cnys.com/upload9/video/2017-04-13/RpsJpBeSH7.m4a","audio_time":"","audio_num":"36802"}]
         * element_list : [{"num_time":"","num":"","end_time":"0:14.50","start_time":"0:00.00","element":"","dsc":"跪卧收腹 8次"},{"num_time":"","num":"8","end_time":"1:43.50","start_time":"0:14.60","element":"4","dsc":""},{"num_time":"","num":"","end_time":"2:06.40","start_time":"1:43.50","element":"","dsc":"坐姿后弯腰 2×8次"},{"num_time":"","num":"8","end_time":"3:37.20","start_time":"2:06.40","element":"4","dsc":""},{"num_time":"30","num":"","end_time":"4:07.20","start_time":"3:37.20","element":"5","dsc":"下一组：摸膝卷腹 2×10次"}]
         */

        private String id;
        private String name;
        private String logo_url;
        private String exaggerate;
        private String wtime;
        private String apparatus;
        private String proposal;
        private String suitable;
        private String attention;
        private String energy;
        private List<StepBean> step;
        private List<VideoListBean> video_list;
        private List<AudioListBean> audio_list;
        private List<ElementListBean> element_list;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLogo_url() {
            return logo_url;
        }

        public void setLogo_url(String logo_url) {
            this.logo_url = logo_url;
        }

        public String getExaggerate() {
            return exaggerate;
        }

        public void setExaggerate(String exaggerate) {
            this.exaggerate = exaggerate;
        }

        public String getWtime() {
            return wtime;
        }

        public void setWtime(String wtime) {
            this.wtime = wtime;
        }

        public String getApparatus() {
            return apparatus;
        }

        public void setApparatus(String apparatus) {
            this.apparatus = apparatus;
        }

        public String getProposal() {
            return proposal;
        }

        public void setProposal(String proposal) {
            this.proposal = proposal;
        }

        public String getSuitable() {
            return suitable;
        }

        public void setSuitable(String suitable) {
            this.suitable = suitable;
        }

        public String getAttention() {
            return attention;
        }

        public void setAttention(String attention) {
            this.attention = attention;
        }

        public String getEnergy() {
            return energy;
        }

        public void setEnergy(String energy) {
            this.energy = energy;
        }

        public List<StepBean> getStep() {
            return step;
        }

        public void setStep(List<StepBean> step) {
            this.step = step;
        }

        public List<VideoListBean> getVideo_list() {
            return video_list;
        }

        public void setVideo_list(List<VideoListBean> video_list) {
            this.video_list = video_list;
        }

        public List<AudioListBean> getAudio_list() {
            return audio_list;
        }

        public void setAudio_list(List<AudioListBean> audio_list) {
            this.audio_list = audio_list;
        }

        public List<ElementListBean> getElement_list() {
            return element_list;
        }

        public void setElement_list(List<ElementListBean> element_list) {
            this.element_list = element_list;
        }

        public static class StepBean {
            /**
             * px_num : 1
             * num : 1
             * num_time :
             * frequency : 8
             * video_name : 跪卧收腹
             * video_url : http://alipic.cnys.com/upload9/video/2017-04-11/kexk4xadMd.mp4
             * video_time :
             * video_num :
             * logo_url : http://alipic.cnys.com/upload9/image/2017-04-11/np74byxiMP.png
             */

            private String px_num;
            private String num;
            private String num_time;
            private String frequency;
            private String video_name;
            private String video_url;
            private String video_time;
            private String video_num;
            private String logo_url;

            public String getPx_num() {
                return px_num;
            }

            public void setPx_num(String px_num) {
                this.px_num = px_num;
            }

            public String getNum() {
                return num;
            }

            public void setNum(String num) {
                this.num = num;
            }

            public String getNum_time() {
                return num_time;
            }

            public void setNum_time(String num_time) {
                this.num_time = num_time;
            }

            public String getFrequency() {
                return frequency;
            }

            public void setFrequency(String frequency) {
                this.frequency = frequency;
            }

            public String getVideo_name() {
                return video_name;
            }

            public void setVideo_name(String video_name) {
                this.video_name = video_name;
            }

            public String getVideo_url() {
                return video_url;
            }

            public void setVideo_url(String video_url) {
                this.video_url = video_url;
            }

            public String getVideo_time() {
                return video_time;
            }

            public void setVideo_time(String video_time) {
                this.video_time = video_time;
            }

            public String getVideo_num() {
                return video_num;
            }

            public void setVideo_num(String video_num) {
                this.video_num = video_num;
            }

            public String getLogo_url() {
                return logo_url;
            }

            public void setLogo_url(String logo_url) {
                this.logo_url = logo_url;
            }
        }

        public static class VideoListBean {
            /**
             * num_time :
             * num :
             * end_time : 0:14.50
             * start_time : 0:00.00
             * video_name : 跪卧收腹
             * video_url : http://alipic.cnys.com/upload9/video/2017-04-11/kexk4xadMd.mp4
             * video_time :
             * video_num :
             */

            private String num_time;
            private String num;
            private String end_time;
            private String start_time;
            private String video_name;
            private String video_url;
            private String video_time;
            private String video_num;

            public String getNum_time() {
                return num_time;
            }

            public void setNum_time(String num_time) {
                this.num_time = num_time;
            }

            public String getNum() {
                return num;
            }

            public void setNum(String num) {
                this.num = num;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getVideo_name() {
                return video_name;
            }

            public void setVideo_name(String video_name) {
                this.video_name = video_name;
            }

            public String getVideo_url() {
                return video_url;
            }

            public void setVideo_url(String video_url) {
                this.video_url = video_url;
            }

            public String getVideo_time() {
                return video_time;
            }

            public void setVideo_time(String video_time) {
                this.video_time = video_time;
            }

            public String getVideo_num() {
                return video_num;
            }

            public void setVideo_num(String video_num) {
                this.video_num = video_num;
            }
        }

        public static class AudioListBean {
            /**
             * end_time :
             * start_time : 0:00.00
             * audio_name : 旁白-跪卧收腹
             * audio_url : http://alipic.cnys.com/upload9/video/2017-04-13/Xy27aEPEBD.m4a
             * audio_time :
             * audio_num : 16964
             */

            private String end_time;
            private String start_time;
            private String audio_name;
            private String audio_url;
            private String audio_time;
            private String audio_num;

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getAudio_name() {
                return audio_name;
            }

            public void setAudio_name(String audio_name) {
                this.audio_name = audio_name;
            }

            public String getAudio_url() {
                return audio_url;
            }

            public void setAudio_url(String audio_url) {
                this.audio_url = audio_url;
            }

            public String getAudio_time() {
                return audio_time;
            }

            public void setAudio_time(String audio_time) {
                this.audio_time = audio_time;
            }

            public String getAudio_num() {
                return audio_num;
            }

            public void setAudio_num(String audio_num) {
                this.audio_num = audio_num;
            }
        }

        public static class ElementListBean {
            /**
             * num_time :
             * num :
             * end_time : 0:14.50
             * start_time : 0:00.00
             * element :
             * dsc : 跪卧收腹 8次
             */

            private String num_time;
            private String num;
            private String end_time;
            private String start_time;
            private String element;
            private String dsc;

            public String getNum_time() {
                return num_time;
            }

            public void setNum_time(String num_time) {
                this.num_time = num_time;
            }

            public String getNum() {
                return num;
            }

            public void setNum(String num) {
                this.num = num;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getElement() {
                return element;
            }

            public void setElement(String element) {
                this.element = element;
            }

            public String getDsc() {
                return dsc;
            }

            public void setDsc(String dsc) {
                this.dsc = dsc;
            }
        }
    }
}
